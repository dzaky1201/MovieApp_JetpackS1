package com.dzakyhdr.movieapp
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.dzakyhdr.movieapp.data.DummyData
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    private val dummyMovie = DummyData.getMovie()

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()
        ))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovie[0].title)))
    }

    @Test
    fun loadTvShow() {
        onView(withText(R.string.tvshow)).perform(ViewActions.click())
        onView(withId(R.id.rvTv)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
        onView(withId(R.id.rvTv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
    }

}