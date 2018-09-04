package com.example.arvind.svceinterrupt;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    TextView eventname,eventdetails,eventrules,ruleshead;

    String intentdetail;

    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        intentdetail=getIntent().getStringExtra("name");
        eventname=(TextView)findViewById(R.id.eventname);
        eventdetails=(TextView)findViewById(R.id.eventdetails);
        eventrules=(TextView)findViewById(R.id.eventrules);
        ruleshead=(TextView)findViewById(R.id.ruleshead);
        img=(ImageView)findViewById(R.id.img);


        if(intentdetail.equals("flex")){
            img.setImageResource(R.drawable.css);
           eventname.setText("Flexbox Froggy");
            eventdetails.setText("It is a web-design competition that enables you to showcase the power of CSS. Designers and coders alike have contributed to the beauty of the web. Flexbox Froggy aims to excite, inspire and encourage participants to style the website, making it presentable and attractive.\n");
            eventrules.setText("");
        }
        if(intentdetail.equals("ichallenge")){
            img.setImageResource(R.drawable.b4);
            eventname.setText("Interrupt Challenge");
            eventdetails.setText("Who’s up for a nail biting online event full of riddles? Work your way through levels by solving interesting brain-teasers through this journey. All you need is the enthusiasm and spirit to keep climbing through the levels within the specified time span. Don’t just think, REGISTER!.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("generic")){
            img.setImageResource(R.drawable.code);
            eventname.setText("Generic Coding");
            eventdetails.setText("Coding is today’s language of creativity. Are you fluent in coding? Then this is the right place for you to be! With the clock ticking on, there are a set of questions of varying difficulty levels for you to solve. Think you’d be able to handle that? Then giddy up to challenge yourself, here at Interrupt 2k18’s generic coding event.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("terminal")){
            img.setImageResource(R.drawable.terminal);
            eventname.setText("Terminal of Secrets");
            eventdetails.setText("Are you crazy about finding clues and deciphering them? Would you like to discover a treasure? Then, it's certain that you'll be more than just ready to hunt for it. But will you still hunt for it even if it's on a terminal? If that's the case, boot up to hunt for a stunning treasure on a linux terminal and prove that you really are the Indiana Jones-que person you think you are.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("pitch")){
            img.setImageResource(R.drawable.marketing);
            eventname.setText("Pitch Perfect");
            eventdetails.setText("Power today is the ability to communicate and persuade. If you think that getting people to listen to you is hard, convincing them to agree with you is much harder. PITCH PERFECT brings to you the perfect opportunity to bring your persuading, negotiating and influencing skills to the fore. If you think you've got these skills, then voila! This is “THE” event for you.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("logic")){
            img.setImageResource(R.drawable.logical);
            eventname.setText("Logician’s Code");
            eventdetails.setText("You can be good at coming up with solutions but, how quickly does your brain work when you are under pressure? How will you perform when your life depends on it? Logician’s Code tests the problem-solving ability by locking them up in a room. The only way to get to the final room is to find the clues and use them to escape the room within the stipulated amount of time.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("inquiz")){
            img.setImageResource(R.drawable.quiz);
            eventname.setText("Inquizitive");
            eventdetails.setText("Ahoy! NON-TECH EVENT here. All you need is general technological knowledge and the enthusiasm for participating in the most challenging yet fun quiz ever!-the INTERRUPT 2k18’s ‘INQUIZITIVE’. So, put together your team and rack your brains in this new take on quizzes wherein you’ll first have a technological GK round followed by more rounds of pure fun! Buckle up....and REGISTER NOW!");
            eventrules.setText("✓Two members per team ✓Team members can be from any year, department and college ✓No devices are allowed during the event ✓The quizmaster’s word will be final!\n");

        }
        if(intentdetail.equals("ds")){
            img.setImageResource(R.drawable.analytics);
            eventname.setText("DataScience");
            eventdetails.setText("Data is everything. We live in the world of 1s and 0s where data gives you vision and a mission to accomplish. What mission, you may ask. That's what Interrupt is here for. Extracting data alone is not enough. Analysing the given data and thereby coming to an accurate conclusion is what makes you valuable to a company. Participate in the DataScience event and show us what you are capable of predicting with the given datasets.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("techno")){
            img.setImageResource(R.drawable.techcrunch);
            eventname.setText("Techno-fair");
            eventdetails.setText("If you are good at something, never do it for free. After all, everything comes at a price. Techno-fair brings to you a set of fun and entertaining events in which you can participate, progress, win and earn points. Trade the points you earn to get cool gadgets in an auction with several other participants bidding for the same set of products.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("ppt")){
            img.setImageResource(R.drawable.present);
            eventname.setText("Presentation Hub");
            eventdetails.setText("Knowledge is meant to be shared. Presentation hub is the right place for you if you have out-of-the-box ideas to bring about a change in the world of computers. Pen down your innovative ideas to help the people around you get better perspective and understanding. After all, every idea is a good idea in its own unique way.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("tech")){
            img.setImageResource(R.drawable.project);
            eventname.setText("TechCrunch");
            eventdetails.setText("Change is the only constant in the entire universe. Time changes, concepts change, and so do our thought processes. The way the world functions keep changing. With people finding new approaches to improve their lifestyle and bring changes, our world is becoming better day by day. Come and show us your mind blowing projects and new innovations that will change the perception of the world at this year's TechCrunch.\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("pipe")){
            img.setImageResource(R.drawable.code2);
            eventname.setText("Pipe the Piper");
            eventdetails.setText("Where there is a problem, there is a solution! 'Pipe the piper' makes you code along with various code geeks virtually and arrive at solutions within the given time. Just to spice things up in this event, the scores will be given based on how fast the challenge is completed. You'll never know who comes up with a better solution first! Remember, there are thousands of people who'll be focusing on the same real-world problem at any given time. So, brace yourself for some competitive programming!\n");
            eventrules.setText("");

        }
        if(intentdetail.equals("aws")){
            img.setImageResource(R.drawable.workshop);
            eventname.setText("AWS Workshop");
            eventdetails.setText("An exciting workshop on AWS Compute, Database and Server Management with the modules- AWS EC2, AWS DynamoDB, AWS S3 and AWS CodeBuild. Do not miss out on this opportunity to enrich yourself with truckloads of knowledge on these services.\n");
            eventrules.setText("");

        }
    }
}
