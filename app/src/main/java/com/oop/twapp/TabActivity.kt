//package com.oop.twapp
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ImageView
//import androidx.viewpager.widget.ViewPager
//import com.google.android.material.tabs.TabLayout
//
//class TabActivity : AppCompatActivity() {
//
//    private lateinit var tabToHomeButton: ImageView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_tab)
//
//        val viewPager: ViewPager = findViewById(R.id.viewPager)
//        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
//
//        val adapter = TabAdapter(supportFragmentManager)
//        adapter.addFragment(MathematicsFragment(), "Mathematics")
//        adapter.addFragment(ScienceFragment(), "Science")
//        adapter.addFragment(MusicArtsFragment(), "Music and Arts")
//        adapter.addFragment(ForeignLanguagesFragment(), "Foreign Languages")
//        adapter.addFragment(HistoryFragment(), "History and Social Studies")
//        adapter.addFragment(ComputerFragment(), "Computer Science and Programming")
//
//
//        viewPager.adapter = adapter
//        tabLayout.setupWithViewPager(viewPager)
//
//        val tabToHomeButton = findViewById<ImageView>(R.id.tabToHomeButton)
//
//        tabToHomeButton.setOnClickListener {
//            finish()
//        }
//    }
//}