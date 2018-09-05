package com.example.arvind.svceinterrupt;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            eventdetails.setText("CSS is beautiful.\t\t\n" +
                    "CSS is powerful. \n" +
                    "Be the best artist there is.\n" +
                    "Create the best design and take home the prize! \n" +
                    "An Attractive, interactive, user-friendly style and you’re good to go.\n");
            eventrules.setText("1. Individual participation.\n" +
                    "2. There will be a pen & paper prelims.\n" +
                    "3. Final round will require participants to build their own website based on the given theme.\n" +
                    "4. Internet access will be allowed for reference.\n" +
                    "5. Copying an existing website is strictly prohibited and will lead to disqualification.\n");
            contact.setText("Manav (+91 9962788926) or Kaushik (+91 8939571357)");

        }
        if(intentdetail.equals("ichallenge")){
            img.setImageResource(R.drawable.b4);
            eventname.setText("Interrupt Challenge");
            eventdetails.setText("Our Signature Event.\n" +
                    "Work your way through levels by solving interesting brain-teasers.\n" +
                    "Like riddles? We’ve got you covered.\n" +
                    "Like a challenge? We’ve still got you covered!\n" +
                    "Don’t think! Go online and start solving.\n");
            eventrules.setText("1. This is an online event which will happen over a period of ten days starting from the 17th to the 27th of September.\n" +
                    "2. There will be 10+ levels, each consisting of hints to solve the particular problem\n" +
                    "3. The person to finish the all the levels will be declared the winner. In case of multiple people finishing all the levels, the first person to finish will be the winner.\n");

            contact.setText("Tamizh Arasu (+91 9655807979) or Adithya (+91 9003253308)");
        }
        if(intentdetail.equals("generic")){
            img.setImageResource(R.drawable.code);
            eventname.setText("Clash of Codes");
            eventdetails.setText("Time’s running out! \n" +
                    "Can you be the very best? \n" +
                    "With the clock ticking, there awaits a set of questions for you to be solved. The questions get harder as you go.\n" +
                    "Code your way to the finish line in INTERRUPT’s mainstream coding dhamaka!\n");
            eventrules.setText("1. Teams of upto 3 members.\n" +
                    "2. Time limit: 60 minutes\n" +
                    "3. Points will be awarded based on your output. Team with the most points at the end will win.\n");

            contact.setText("Pravesh Agarwal (+91 9566072778) or Karthik (+91 7448632621)");
        }
        if(intentdetail.equals("terminal")){
            img.setImageResource(R.drawable.terminal);
            eventname.setText("Terminal of Secrets");
            eventdetails.setText("Like Gaming? Like Coding? Well, you’re in luck! Terminal of Secrets gives you the perfect opportunity to do both! \n" +
                    "One games while the other codes! And then you switch!\n" +
                    "Head over to INTERRUPT’s unique event: The Terminal of Secrets.\n");
            eventrules.setText("1. Teams of two people.\n" +
                    "2. One member will be the “Gamer”, the other member will be the “Coder”. You cannot swap members during the event.\n");

            contact.setText("Adarsh (+91 9840876582) or Balaji (+91 9087712810)");
        }
        if(intentdetail.equals("pitch")){
            img.setImageResource(R.drawable.marketing);
            eventname.setText("Pitch Perfect");
            eventdetails.setText("Words have Power, Words are Power. \n" +
                    "Strategize.\n" +
                    "Persuade.\n" +
                    "Negotiate. \n" +
                    "Impress us with your oratory skills! Sell the product! Be the best Salesperson around! Promote the product in the best way you can.\t\n");
            eventrules.setText("1. Teams of two participants.\n" +
                    "2. Vulgarity of any sort is prohibited.\n" +
                    "3. Judge’s decision is final.\n");

            contact.setText("Fehmaan (+91 9841626469) or Mohammed Anan (+91 9884613747)");
        }
        if(intentdetail.equals("logic")){
            img.setImageResource(R.drawable.logical);
            eventname.setText("Logician’s Code 2.0");
            eventdetails.setText("Work well under Pressure?\n" +
                    "Can you connect the dots well? \n" +
                    "Even when you’re stressed?\n" +
                    "\n" +
                    "Logician’s Code tests your problem-solving ability by locking you, and a few others, up in a room. Find clues and use them to escape to the final room! All this with time ticking.\n");
            eventrules.setText("1. Team size: 1-2 participants.\n" +
                    "2. Participants who clear the written quiz are allowed onto the next round.\n" +
                    "3. The team which utilizes the least time to escape will be announced winner.\n" +
                    "4. Organizer’s decision is final.\n");

            contact.setText("Pranesh (+91 9003189927) or Sheik Ismail (+91 9445789851)");
        }
        if(intentdetail.equals("inquiz")){
            img.setImageResource(R.drawable.quiz);
            eventname.setText("Inquizitive");
            eventdetails.setText("Are you well versed with current technological trends? \n" +
                    "Can you “Interrupt” the questions with your answers?\n" +
                    "Quiz your way to the finale in INTERRUPT’s very own Tech Quiz: INQUIZITIVE.\n" +
                    "And remember, it’s about technology, it won’t be technical!\n");
            eventrules.setText("1. Teams of two people.\n" +
                    "2. There will be a preliminary round from which the top 6 teams will be chosen for the finals.\n" +
                    "3. Usage of any electronic device is strictly prohibited. \n" +
                    "4. The Quizmaster's decision is final.\n");

            contact.setText("Akash Saravanan (+91 9962754468) or Arjun Aravind (8939227284)");
        }
        if(intentdetail.equals("ds")){
            img.setImageResource(R.drawable.analytics);
            eventname.setText("Datafication");
            eventdetails.setText("Can you make sense from nonsense?\n" +
                    "Extract the data.\n" +
                    "Analyze and Predict.\n" +
                    "Improve your Accuracy.\n" +
                    "Channel your inner Data Scientist.\n" +
                    "Join us at INTERRUPT’s Data Science Event: Datafication.\n" +
                    "More information coming soon!\n");
            eventrules.setText("1. This is an online individual event.\n" +
                    "2. Participants can submit the solution only once.\n" +
                    "3. The participant who manages to achieve the highest accuracy score for the given dataset will be declared the winner.\n" +
                    "4. Judges’ decision is final.\n");

            contact.setText("Sathvik (+91 7708026256) or Chran (+91 9500132964)");
        }
        if(intentdetail.equals("techno")){
            img.setImageResource(R.drawable.techcrunch);
            eventname.setText("Techno-fair");
            eventdetails.setText("If you’re good at something, NEVER do it for free. The SVCE ACM Student Chapter brings you a fun-filled event where you can put to use all those skills you never thought you’d use!\n" +
                    "An event with mini events where you use your skill to bag some points?\n" +
                    "Points you can trade for cool stuff?\n" +
                    "At an auction?\n" +
                    "Sounds good?\n" +
                    "Head over to INTERRUPT’s bidding event: The Techno-Fair.\n" +
                    "And don’t worry if you can’t code, you won’t need to! It’s non-technical!\n");
            eventrules.setText("1. You will be given points at the starting of the event.\n" +
                    "2. You can use these points to enter into the mini-events available. If you win the event, you will gain more points.\n" +
                    "3. At the end of the event, there will be an auction where you can bid on prizes.\n" +
                    "4. You can leave in-between to participate in other events.\n" +
                    "5. Lose your coins, lose your points.\n" +
                    "6. Organizers have the final say in all decisions made.\n");

            contact.setText("Pranav Wadhwa (+91 7200820090) or Aravind Balakrishnan (+91 9940261858)");
        }
        if(intentdetail.equals("ppt")){
            img.setImageResource(R.drawable.present);
            eventname.setText("Presentation Hub");
            eventdetails.setText("Pen down your innovative ideas.\n" +
                    "Explain your idea and submit your paper, if you will.  \n" +
                    "Impress our judges\n" +
                    "Bag the prize!\n" +
                    "\n" +
                    "Welcome to INTERRUPT’s Presentation Hub, where your ideas matter.\n" +
                    "\n" +
                    "Topics:\n" +
                    "1.\tInternet of Things\n" +
                    "2.\tCloud Security and Privacy\n" +
                    "3.\tVirtualization\n" +
                    "4.\tHPC on Cloud\n" +
                    "5.\tHoneypot\n" +
                    "6.\tWireless communication system\n" +
                    "7.\tThe Bluetooth technology\n" +
                    "8.\tData Management in Sensor Networks\n" +
                    "9.\tDecentralized Networking\n" +
                    "10.\tSpeech signal Analysis by Signal Processing\n" +
                    "11.\tData Security using Neural Networks\n" +
                    "12.\tBig Data Analytics\n" +
                    "13.\tMapReduce\n" +
                    "14.\tBig Data Search and Mining\n" +
                    "15.\tBig Data Security and Privacy\n");
            eventrules.setText("1. Teams of up to 3 members.\n" +
                    "2. Submissions must include title, author’s details, abstract, keywords and full paper should not exceed 6 pages including all tables and figures in the IEEE format.\n" +
                    "3. Selected participants should bring 2 hard copies of their paper and softcopy of presentation in .ppt format.\n" +
                    "4. Six minutes for presentation and two minutes for queries.\n");

            contact.setText("Yogeshwar (+91 9597855459)");
        }
        if(intentdetail.equals("tech")){
            img.setImageResource(R.drawable.project);
            eventname.setText("TechCrunch");
            eventdetails.setText("Change is the only constant in the entire universe. Time changes, concepts change, and so do our thought processes. The way the world functions keep changing. With people finding new approaches to improve their lifestyle and bring changes, our world is becoming better day by day. Come and show us your mind blowing projects and new innovations that will change the perception of the world at this year's TechCrunch.\n");
            eventrules.setText("");
            contact.setText("");
        }
        if(intentdetail.equals("pipe")){
            img.setImageResource(R.drawable.code2);
            eventname.setText("Pipe the Piper");
            eventdetails.setText("A single problem can be solved by not one, but multiple solutions. \n" +
                    "Tackle the problem along with fellow coders\n" +
                    "Virtually code and arrive at solutions within the given time. \n" +
                    "But that’s not all!\n" +
                    "\n" +
                    "Teams will be scored based on how fast the challenge is completed. \n" +
                    "You never know who could come up with a better solution first \n" +
                    "So, brace yourself for some competitive programming and head over to Interrupt’s Pipe the Piper\n");
            eventrules.setText("1. Individual online event.\n" +
                    "2. The event will be open for a total of 6 hours. Participants may choose a 2-hour window in this time frame to take part in the event.\n" +
                    "3. The participant with the highest score will be declared the winner.\n" +
                    "4. Plagiarism of code will lead to instant disqualification.\n");

            contact.setText("Shravan(+91 9840476486) or Arun Daniel (+91 9952056265)");
        }
        if(intentdetail.equals("aws")){
            img.setImageResource(R.drawable.workshop);
            eventname.setText("AWS Workshop");
            eventdetails.setText("An exciting workshop on AWS Compute, Database and Server Management with the \n" +
                    "modules- AWS EC2, AWS DynamoDB, AWS S3 and AWS CodeBuild. \n" +
                    "Thou shalt learn and thou shalt understand.\n" +
                    "More details coming soon. Stay tuned!\n");
            eventrules.setText("");

            contact.setText("Abishaik (+91 8939407365) or Muralee (+91 7845123400)");
        }
    }
}
