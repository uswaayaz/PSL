package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val recyclerview: RecyclerView = findViewById(R.id.RecyclerView)
        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter = adapter

        val manager = LinearLayoutManager(this)
        recyclerview.layoutManager = manager
    }

    private fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()

        articles.add(Article("PSL1 (2016) Winner", " February 4, 2016 – February 23, 2016", R.drawable.image1, "The Pakistan Super League (PSL) debuted its first season in 2016, bringing a major boost to Pakistan’s domestic cricket. Organized by the Pakistan Cricket Board (PCB), the inaugural season took place from February 4 to February 23, 2016, with all matches held in the UAE due to security concerns. Five franchises competed: Islamabad United, Karachi Kings, Lahore Qalandars, Peshawar Zalmi, and Quetta Gladiators. The tournament followed a double round-robin format, leading into playoffs. Islamabad United, led by Misbah-ul-Haq, emerged as the champions, defeating Quetta Gladiators in the final. Dwayne Smith and Andre Russell played key roles in Islamabad's triumph, with Russell becoming the top wicket-taker of the season. Quetta’s Mohammad Nawaz made a strong impact with his all-around performances. The PSL 2016 set the stage for Pakistan’s rising talent and attracted international stars like Chris Gayle, Kevin Pietersen, and Shane Watson, making it a landmark event for Pakistan cricket.  "))
        articles.add(Article("PSL2 (2017) Winner ", "February 9 to March 5, 2017 ", R.drawable.image2, " The second season of the Pakistan Super League (PSL), held in 2017, was a significant milestone in the development of cricket in Pakistan. Organized by the Pakistan Cricket Board (PCB), this T20 league attracted international players and large fan followings. The season kicked off on February 9, 2017, with five teams—Karachi Kings, Lahore Qalandars, Islamabad United, Quetta Gladiators, and Peshawar Zalmi—competing in a round-robin format followed by playoffs. The matches were primarily held in the UAE, due to security concerns in Pakistan, but the final was played in Lahore, a landmark event for Pakistan cricket as it signaled the return of high-profile international cricket to the country. Peshawar Zalmi, led by Darren Sammy, emerged victorious by defeating Quetta Gladiators in the final, held at the Gaddafi Stadium in Lahore on March 5, 2017. The final was a thrilling encounter, and the tournament as a whole was marked by exciting performances from both local and international players. Kamran Akmal of Peshawar Zalmi was the top scorer of the season, and Sohail Khan from Karachi Kings was the leading wicket-taker. The success of PSL 2017 boosted Pakistan’s reputation as a safe host for international cricket events and laid the groundwork for future PSL seasons. "))
        articles.add(Article("PSL3 (2018) Winner ", "February 22 to March 25, 2018 ", R.drawable.image3, "The Pakistan Super League (PSL) Season 3 took place in 2018, marking the third edition of Pakistan's premier T20 cricket tournament. Organized by the Pakistan Cricket Board (PCB), the season featured six franchises: Islamabad United, Karachi Kings, Lahore Qalandars, Peshawar Zalmi, Quetta Gladiators, and the newly added Multan Sultans. The tournament was played from February 22 to March 25, 2018, with matches hosted in the UAE and Pakistan, as the country continued efforts to bring international cricket back home. Islamabad United emerged as the champions, winning their second PSL title by defeating the defending champions, Peshawar Zalmi, in the final held at Karachi's National Stadium. Luke Ronchi was the standout performer, ending as the tournament's top run-scorer and receiving the Player of the Tournament award. The season saw exciting cricket, with explosive batting, quality bowling, and young talent rising to the occasion, further solidifying PSL's reputation as a top T20 league in the world. "))
        articles.add(Article(" PSL4 (2019) Winner", "February 14 to March 17, 2019 ", R.drawable.image4, " The fourth season of the Pakistan Super League (PSL) was held in 2019 and saw a thrilling competition among six teams: Islamabad United, Karachi Kings, Lahore Qalandars, Multan Sultans, Peshawar Zalmi, and Quetta Gladiators. Quetta Gladiators, under the leadership of Sarfaraz Ahmed, emerged as the champions of PSL Season 4, defeating Peshawar Zalmi by eight wickets in the final. This victory marked Quetta's first PSL title after having reached the final in previous editions.PSL 2019 featured matches played in both the UAE and Pakistan, with a total of 34 matches. The tournament's group stage was held primarily in the UAE, and the final leg, including the playoffs, was played in Karachi. The competition followed a double round-robin format, where each team faced the others twice before the playoffs.Several international and Pakistani stars shone throughout the season, with Shane Watson from Quetta Gladiators finishing as the top scorer and Hasan Ali from Peshawar Zalmi leading the wicket-takers list. The tournament continued to grow in stature, contributing significantly to Pakistan's efforts to bring top-tier cricket back to the country. "))
        articles.add(Article(" PSL5 (2020) Winner", "  February 20 to November 17, 2020 ", R.drawable.image5, "The fifth season of the Pakistan Super League (PSL) took place in 2020 and marked the first time the entire tournament was held in Pakistan. The season featured six teams: Islamabad United, Karachi Kings, Lahore Qalandars, Multan Sultans, Peshawar Zalmi, and Quetta Gladiators. It followed a double round-robin format, where each team played 10 matches, and the top four advanced to the playoffs.Karachi Kings, captained by Imad Wasim, emerged as the champions by defeating Lahore Qalandars in the final, played at the National Stadium in Karachi. This was a significant win for Karachi as it was their first PSL title. Babar Azam, the standout player for Karachi Kings, played a crucial role in their victory, finishing as the tournament's leading run-scorer. The season also introduced the use of the Decision Review System (DRS) in the T20 format, a move that further enhanced the league's professionalism and appeal. This edition of PSL was particularly noteworthy for boosting Pakistan’s cricketing image globally by successfully hosting all matches in the country after previous seasons were partially held abroad due to security concerns "))

        articles.add(Article("PSL6 (2021) Winner ", "February 20 to June 24, 2021", R.drawable.image6, "The Pakistan Super League (PSL) Season 6 took place in 2021 and was one of the most thrilling editions of the tournament. The league began on February 20, 2021, in Karachi but faced an interruption due to COVID-19, leading to its suspension in March. The remaining matches were rescheduled and completed in June 2021 in Abu Dhabi. Six franchises competed for the title: Islamabad United, Karachi Kings, Lahore Qalandars, Multan Sultans, Peshawar Zalmi, and Quetta Gladiators. Multan Sultans emerged as the champions for the first time, defeating Peshawar Zalmi in the final by 47 runs. Mohammad Rizwan’s leadership and the outstanding performances by players like Sohaib Maqsood and Shahnawaz Dahani played a pivotal role in the team's victory.  "))
        articles.add(Article(" PSL7 (2022) Winner", " January 27 to February 27, 2022", R.drawable.image7, "The Pakistan Super League (PSL) Season 7, which took place in 2022, featured an exciting format that included six franchises: Karachi Kings, Lahore Qalandars, Islamabad United, Peshawar Zalmi, Quetta Gladiators, and Multan Sultans. The tournament ran from January 27 to February 27, 2022, and matches were held in various cities, including Lahore and Karachi. Multan Sultans emerged as the champions, successfully defending their title by defeating Lahore Qalandars in the final, held at the Gaddafi Stadium in Lahore. The season was marked by impressive individual performances, with Babar Azam of Karachi Kings claiming the title of the tournament's leading run-scorer. The tournament not only showcased local talent but also attracted international players, enhancing the league's competitiveness and popularity. Season 7 of the PSL was well-received by fans, further solidifying the league's reputation as one of the premier T20 cricket competitions in the world.  "))
        articles.add(Article("PSL8 (2023) Winner ", " February 13 to March 19, 2023", R.drawable.image8, "  The Pakistan Super League (PSL) Season 8, held in 2023, showcased thrilling cricketing action. This season featured six franchises: Karachi Kings, Lahore Qalandars, Multan Sultans, Peshawar Zalmi, Quetta Gladiators, and Islamabad United. The tournament kicked off with a grand opening ceremony at the Multan Cricket Stadium, which included performances by various artists and fireworks. The league adopted a double round-robin format, with each team facing the others twice, followed by playoffs. Lahore Qalandars emerged as the champions, successfully defending their title by defeating Multan Sultans in a high-stakes final at the Gaddafi Stadium in Lahore. Shaheen Afridi, the captain of Lahore Qalandars, played a crucial role throughout the tournament, leading his team with exceptional performances. Notably, the season witnessed outstanding individual performances, with several players achieving remarkable milestones and breaking records. The PSL Season 8 not only enhanced the popularity of cricket in Pakistan but also attracted international talent, further solidifying its status as a prominent T20 league globally."))
        articles.add(Article(" PSL9 (2024) Winner", " February 13 to March 19, 2024", R.drawable.image9, " The Pakistan Super League (PSL) Season 9 kicked off with heightened excitement and expectations from fans and players alike. This season featured six franchises, each representing major cities across Pakistan, and was held in various venues, including Karachi, Lahore, and Multan. The tournament showcased a blend of seasoned international stars and emerging local talent, making it a highly competitive event. The format comprised a double round-robin followed by playoffs, ensuring every team had ample opportunity to prove its mettle. Key players, including both domestic heroes and foreign superstars, drew significant attention, with each franchise assembling a strong roster. The league's unique atmosphere, complete with vibrant crowds and colorful festivities, further enhanced the viewing experience. In addition to thrilling matches, PSL Season 9 focused on community engagement and social initiatives, reinforcing its commitment to promoting cricket in Pakistan. The tournament also featured various partnerships and sponsorships, elevating its global profile. As the season progressed, matchups became increasingly intense, with teams vying for playoff spots and fans passionately supporting their favorites. With its rich history and promising future, PSL Season 9 solidified its reputation as one of the premier T20 leagues in the world, captivating audiences both locally and internationally. "))


        return articles
    }
}
