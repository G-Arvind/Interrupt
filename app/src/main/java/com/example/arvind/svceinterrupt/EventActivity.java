package com.example.arvind.svceinterrupt;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class EventActivity extends AppCompatActivity {

    TextView eventname,eventdetails,eventrules,ruleshead,contact;

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
        contact=(TextView)findViewById(R.id.contact);
        img=(ImageView)findViewById(R.id.img);


        if(intentdetail.equals("flex")){
            img.setImageResource(R.drawable.css);
           eventname.setText("Art Attack");
            eventdetails.setText("CSS is beautiful.\t\t\n\n" +
                    "CSS is powerful. \n\n" +
                    "Be the best artist there is.\n\n" +
                    "Create the best design and take home the prize! \n\n" +
                    "An Attractive, interactive, user-friendly style and you’re good to go.\n\n");
            eventrules.setText("1. Individual participation.\n\n" +
                    "2. There will be a pen & paper prelims.\n\n" +
                    "3. Final round will require participants to build their own website based on the given theme.\n\n" +
                    "4. Internet access will be allowed for reference.\n\n" +
                    "5. Copying an existing website is strictly prohibited and will lead to disqualification.\n\n");
            contact.setText("Manav +91 9962788926 \n\nKaushik +91 8939571357");

        }
        if(intentdetail.equals("ichallenge")){
            img.setImageResource(R.drawable.b4);
            eventname.setText("Interrupt Challenge");
            eventdetails.setText("Our Signature Event.\n\n" +
                    "Work your way through levels by solving interesting brain-teasers.\n\n" +
                    "Like riddles? We’ve got you covered.\n\n" +
                    "Like a challenge? We’ve still got you covered!\n\n" +
                    "Don’t think! Go online and start solving.\n\n");
            eventrules.setText("1. This is an online event which will happen over a period of ten days starting from the 17th to the 27th of September.\n\n" +
                    "2. There will be 10+ levels, each consisting of hints to solve the particular problem\n\n" +
                    "3. The person to finish the all the levels will be declared the winner. In case of multiple people finishing all the levels, the first person to finish will be the winner.\n\n");

            contact.setText("Tamizh Arasu +91 9655807979 \n\nAdithya +91 9003253308");
        }
        if(intentdetail.equals("generic")){
            img.setImageResource(R.drawable.code);
            eventname.setText("Clash of Codes");
            eventdetails.setText("Time’s running out! \n\n" +
                    "Can you be the very best?\n \n" +
                    "With the clock ticking, there awaits a set of questions for you to be solved. The questions get harder as you go.\n\n" +
                    "Code your way to the finish line in INTERRUPT’s mainstream coding dhamaka!\n\n");
            eventrules.setText("1. Teams of upto 3 members.\n\n" +
                    "2. Time limit: 60 minutes\n\n" +
                    "3. Points will be awarded based on your output. Team with the most points at the end will win.\n\n");

            contact.setText("Pravesh Agarwal +91 9566072778 \n\nKarthik +91 7448632621");
        }
        if(intentdetail.equals("terminal")){
            img.setImageResource(R.drawable.terminal);
            eventname.setText("Terminal of Secrets");
            eventdetails.setText("Like Gaming? Like Coding? Well, you’re in luck! Terminal of Secrets gives you the perfect opportunity to do both! \n\n" +
                    "One games while the other codes! And then you switch!\n\n" +
                    "Head over to INTERRUPT’s unique event: The Terminal of Secrets.\n\n");
            eventrules.setText("1. Teams of two people.\n\n" +
                    "2. One member will be the “Gamer”, the other member will be the “Coder”. You cannot swap members during the event.\n\n");

            contact.setText("Adarsh +91 9840876582\n\nBalaji +91 9087712810");
        }
        if(intentdetail.equals("pitch")){
            img.setImageResource(R.drawable.marketing);
            eventname.setText("Pitch Perfect");
            eventdetails.setText("Words have Power, Words are Power. \n\n" +
                    "Strategize.\n\n" +
                    "Persuade.\n\n" +
                    "Negotiate. \n\n" +
                    "Impress us with your oratory skills! Sell the product! Be the best Salesperson around! Promote the product in the best way you can.\t\n\n");
            eventrules.setText("1. Teams of two participants.\n\n" +
                    "2. Vulgarity of any sort is prohibited.\n\n" +
                    "3. Judge’s decision is final.\n\n");

            contact.setText("Fehmaan +91 9841626469 \n\nMohammed Anan +91 9884613747");
        }
        if(intentdetail.equals("logic")){
            img.setImageResource(R.drawable.logical);
            eventname.setText("Logician’s Code 2.0");
            eventdetails.setText("Work well under Pressure?\n\n" +
                    "Can you connect the dots well? \n\n" +
                    "Even when you’re stressed?\n\n" +
                    "\n\n" +
                    "Logician’s Code tests your problem-solving ability by locking you, and a few others, up in a room. Find clues and use them to escape to the final room! All this with time ticking.\n\n");
            eventrules.setText("1. Team size: 1-2 participants.\n\n" +
                    "2. Participants who clear the written quiz are allowed onto the next round.\n\n" +
                    "3. The team which utilizes the least time to escape will be announced winner.\n\n" +
                    "4. Organizer’s decision is final.\n\n");

            contact.setText("Pranesh +91 9003189927\nSheik Ismail +91 9445789851");
        }
        if(intentdetail.equals("inquiz")){
            img.setImageResource(R.drawable.quiz);
            eventname.setText("Inquizitive");
            eventdetails.setText("Are you well versed with current technological trends? \n\n" +
                    "Can you “Interrupt” the questions with your answers?\n\n" +
                    "Quiz your way to the finale in INTERRUPT’s very own Tech Quiz: INQUIZITIVE.\n\n" +
                    "And remember, it’s about technology, it won’t be technical!\n\n");
            eventrules.setText("1. Teams of two people.\n\n" +
                    "2. There will be a preliminary round from which the top 6 teams will be chosen for the finals.\n\n" +
                    "3. Usage of any electronic device is strictly prohibited. \n\n" +
                    "4. The Quizmaster's decision is final.\n\n");

            contact.setText("Akash Saravanan +91 9962754468\n\nArjun Aravind 8939227284");
        }
        if(intentdetail.equals("ds")){
            img.setImageResource(R.drawable.analytics);
            eventname.setText("Datafication");
            eventdetails.setText("Can you make sense from nonsense?\n\n" +
                    "Extract the data.\n\n" +
                    "Analyze and Predict.\n\n" +
                    "Improve your Accuracy.\n\n" +
                    "Channel your inner Data Scientist.\n\n" +
                    "Join us at INTERRUPT’s Data Science Event: Datafication.\n\n" +
                    "More information coming soon!\n\n");
            eventrules.setText("1. This is an online individual event.\n\n" +
                    "2. Participants can submit the solution only once.\n\n" +
                    "3. The participant who manages to achieve the highest accuracy score for the given dataset will be declared the winner.\n\n" +
                    "4. Judges’ decision is final.\n\n");

            contact.setText("Sathvik +91 7708026256 \n\nChran +91 9500132964");
        }
        if(intentdetail.equals("techno")){
            img.setImageResource(R.drawable.techcrunch);
            eventname.setText("Techno-fair");
            eventdetails.setText("If you’re good at something, NEVER do it for free. The SVCE ACM Student Chapter brings you a fun-filled event where you can put to use all those skills you never thought you’d use!\n\n" +
                    "An event with mini events where you use your skill to bag some points?\n\n" +
                    "Points you can trade for cool stuff?\n\n" +
                    "At an auction?\n\n"+
                    "Sounds good?\n\n" +
                    "Head over to INTERRUPT’s bidding event: The Techno-Fair.\n\n" +
                    "And don’t worry if you can’t code, you won’t need to! It’s non-technical!\n\n");
            eventrules.setText("1. You will be given points at the starting of the event.\n\n" +
                    "2. You can use these points to enter into the mini-events available. If you win the event, you will gain more points.\n\n" +
                    "3. At the end of the event, there will be an auction where you can bid on prizes.\n\n" +
                    "4. You can leave in-between to participate in other events.\n\n" +
                    "5. Lose your coins, lose your points.\n\n" +
                    "6. Organizers have the final say in all decisions made.\n\n");

            contact.setText("Pranav Wadhwa +91 7200820090 \n\nAravind Balakrishnan +91 9940261858");
        }
        if(intentdetail.equals("ppt")){
            img.setImageResource(R.drawable.present);
            eventname.setText("Presentation Hub");
            eventdetails.setText("Pen down your innovative ideas.\n\n" +
                    "Explain your idea and submit your paper, if you will. \n \n" +
                    "Impress our judges\n" +
                    "Bag the prize!\n" +
                    "\n\n" +
                    "Welcome to INTERRUPT’s Presentation Hub, where your ideas matter.\n\n" +
                    "\n\n" +
                    "Topics:\n\n" +
                    "1.\tInternet of Things\n\n" +
                    "2.\tCloud Security and Privacy\n\n" +
                    "3.\tVirtualization\n\n" +
                    "4.\tHPC on Cloud\n\n" +
                    "5.\tHoneypot\n\n" +
                    "6.\tWireless communication system\n\n" +
                    "7.\tThe Bluetooth technology\n\n" +
                    "8.\tData Management in Sensor Networks\n\n" +
                    "9.\tDecentralized Networking\n\n" +
                    "10.\tSpeech signal Analysis by Signal Processing\n\n" +
                    "11.\tData Security using Neural Networks\n\n" +
                    "12.\tBig Data Analytics\n\n" +
                    "13.\tMapReduce\n\n" +
                    "14.\tBig Data Search and Mining\n\n" +
                    "15.\tBig Data Security and Privacy\n\n");
            eventrules.setText("1. Teams of up to 3 members.\n\n" +
                    "2. Submissions must include title, author’s details, abstract, keywords and full paper should not exceed 6 pages including all tables and figures in the IEEE format.\n\n" +
                    "3. Selected participants should bring 2 hard copies of their paper and softcopy of presentation in .ppt format.\n\n" +
                    "4. Six minutes for presentation and two minutes for queries.\n\n");

            contact.setText("Yogeshwar +91 9597855459");
        }
        if(intentdetail.equals("tech")){
            img.setImageResource(R.drawable.project);
            eventname.setText("TechCrunch");
            eventdetails.setText("Change is the only constant in the entire universe. Time changes, concepts change, and so do our thought processes. The way the world functions keep changing. With people finding new approaches to improve their lifestyle and bring changes, our world is becoming better day by day. Come and show us your mind blowing projects and new innovations that will change the perception of the world at this year's TechCrunch.\n\n");
            eventrules.setText("");
            contact.setText("");
        }
        if(intentdetail.equals("pipe")){
            img.setImageResource(R.drawable.code2);
            eventname.setText("Pipe the Piper");
            eventdetails.setText("A single problem can be solved by not one, but multiple solutions. \n\n" +
                    "Tackle the problem along with fellow coders\n\n" +
                    "Virtually code and arrive at solutions within the given time. \n\n" +
                    "But that’s not all!\n\n" +
                    "\n\n" +
                    "Teams will be scored based on how fast the challenge is completed. \n\n" +
                    "You never know who could come up with a better solution first\n \n" +
                    "So, brace yourself for some competitive programming and head over to Interrupt’s Pipe the Piper\n\n");
            eventrules.setText("1. Individual online event.\n\n" +
                    "2. The event will be open for a total of 6 hours. Participants may choose a 2-hour window in this time frame to take part in the event.\n\n" +
                    "3. The participant with the highest score will be declared the winner.\n\n" +
                    "4. Plagiarism of code will lead to instant disqualification.\n\n");

            contact.setText("Shravan +91 9840476486\n \nArun Daniel +91 9952056265");
        }
        if(intentdetail.equals("aws")){
            img.setImageResource(R.drawable.workshop);
            eventname.setText("AWS Workshop");
            eventdetails.setText("An exciting workshop on AWS Compute, Database and Server Management with the \n\n" +
                    "modules- AWS EC2, AWS DynamoDB, AWS S3 and AWS CodeBuild. \n\n" +
                    "Thou shalt learn and thou shalt understand.\n\n" +
                    "More details coming soon. Stay tuned!\n\n");
            eventrules.setText("");
            ruleshead.setVisibility(View.GONE);
            contact.setText("Abishaik +91 8939407365 \n\nMuralee +91 7845123400");
        }

    }
}
