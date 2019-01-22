/*
 * This program was made by Misha Donais
 * On January 24th, 2019
 * To output and sort marathon data
 */

//Imports
import java.io.*;

public class ICS3UCulminatingForm extends javax.swing.JFrame {
    
    //Array initialization
    int times [] = new int [8];
    int timeInSeconds [] = new int [8];
    String countryAverages[] = new String [3];
    String countries[] = new String [3];
    String runnerInfo [] = new String [8];
    String backToHours [] = new String [3];
    
    //Variables that are country specific
    int kenyaSecs = 0;
    int japanSecs = 0;
    int eritreaSecs = 0;
        
    int kenyaRunners = 0;
    int japanRunners = 0;
    int eritreaRunners = 0;
    
    //Other global variables
    boolean WR = false;
    boolean dataPulled = false;

    public ICS3UCulminatingForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlelbl = new javax.swing.JLabel();
        timelbl0 = new javax.swing.JLabel();
        timelbl1 = new javax.swing.JLabel();
        timelbl2 = new javax.swing.JLabel();
        averageslbl = new javax.swing.JLabel();
        countryRank0lbl = new javax.swing.JLabel();
        countryRank1lbl = new javax.swing.JLabel();
        countryRank2lbl = new javax.swing.JLabel();
        countryName0lbl = new javax.swing.JLabel();
        countryName1lbl = new javax.swing.JLabel();
        countryName2lbl = new javax.swing.JLabel();
        countryTime0lbl = new javax.swing.JLabel();
        countryTime1lbl = new javax.swing.JLabel();
        countryTime2lbl = new javax.swing.JLabel();
        getDatabtn = new javax.swing.JButton();
        timelbl = new javax.swing.JLabel();
        agelbl = new javax.swing.JLabel();
        countrylbl = new javax.swing.JLabel();
        fnamelbl = new javax.swing.JLabel();
        lnamelbl = new javax.swing.JLabel();
        timelbl3 = new javax.swing.JLabel();
        timelbl4 = new javax.swing.JLabel();
        timelbl5 = new javax.swing.JLabel();
        timelbl6 = new javax.swing.JLabel();
        timelbl7 = new javax.swing.JLabel();
        winnerlbl = new javax.swing.JLabel();
        winnerInfolbl = new javax.swing.JLabel();
        findWinnerbtn = new javax.swing.JButton();
        WRlbl = new javax.swing.JLabel();
        countryAvgbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        titlelbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        titlelbl.setText("Berlin Marathon 2018 Data");

        timelbl0.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl0.setText("Time");

        timelbl1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl1.setText("Time");

        timelbl2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl2.setText("Time");

        averageslbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        averageslbl.setText("Country Averages");

        countryRank0lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryRank0lbl.setText("1-");

        countryRank1lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryRank1lbl.setText("2-");

        countryRank2lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryRank2lbl.setText("3-");

        countryName0lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryName0lbl.setText("Country 1");

        countryName1lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryName1lbl.setText("Country 2");

        countryName2lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryName2lbl.setText("Country 3");

        countryTime0lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryTime0lbl.setText("Average time 1");

        countryTime1lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryTime1lbl.setText("Average time 2");

        countryTime2lbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        countryTime2lbl.setText("Average time 3");

        getDatabtn.setText("Get Data");
        getDatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDatabtnActionPerformed(evt);
            }
        });

        timelbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        timelbl.setText("Time");

        agelbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        agelbl.setText("Age");

        countrylbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        countrylbl.setText("Country");

        fnamelbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        fnamelbl.setText("First name ");

        lnamelbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lnamelbl.setText("Last name");

        timelbl3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl3.setText("Time");

        timelbl4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl4.setText("Time");

        timelbl5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl5.setText("Time");

        timelbl6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl6.setText("Time");

        timelbl7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        timelbl7.setText("Time");

        winnerlbl.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        winnerlbl.setText("Winner");

        winnerInfolbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        winnerInfolbl.setText("Time");

        findWinnerbtn.setText("Sort");
        findWinnerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findWinnerbtnActionPerformed(evt);
            }
        });

        WRlbl.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        WRlbl.setText("The current world record is 2:02:57 by Dennis Kimetto");

        countryAvgbtn.setText("Find Country Averages");
        countryAvgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryAvgbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(timelbl2))
                    .addComponent(timelbl1)
                    .addComponent(timelbl0)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timelbl)
                        .addGap(18, 18, 18)
                        .addComponent(fnamelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getDatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findWinnerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lnamelbl)
                                .addGap(44, 44, 44)
                                .addComponent(agelbl)
                                .addGap(38, 38, 38)
                                .addComponent(countrylbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countryRank0lbl)
                                            .addComponent(countryRank1lbl)
                                            .addComponent(countryRank2lbl))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(averageslbl)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(countryName2lbl)
                                                    .addComponent(countryName1lbl)
                                                    .addComponent(countryName0lbl))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(countryTime2lbl)
                                                    .addComponent(countryTime1lbl)
                                                    .addComponent(countryTime0lbl)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(countryAvgbtn)
                                        .addGap(8, 8, 8))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(titlelbl)))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timelbl4)
                            .addComponent(timelbl3)
                            .addComponent(timelbl6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timelbl5)
                                    .addComponent(timelbl7)))
                            .addComponent(winnerlbl)
                            .addComponent(winnerInfolbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(WRlbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titlelbl)
                        .addGap(18, 18, 18)
                        .addComponent(getDatabtn)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timelbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lnamelbl)
                                .addComponent(fnamelbl)
                                .addComponent(agelbl)
                                .addComponent(countrylbl)))
                        .addGap(18, 18, 18)
                        .addComponent(timelbl0)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl1)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl2)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl3)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl4)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl5)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl6)
                        .addGap(18, 18, 18)
                        .addComponent(timelbl7)
                        .addGap(9, 9, 9)
                        .addComponent(findWinnerbtn)
                        .addGap(10, 10, 10)
                        .addComponent(winnerlbl)
                        .addGap(18, 18, 18)
                        .addComponent(winnerInfolbl)
                        .addGap(18, 18, 18)
                        .addComponent(WRlbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(averageslbl)
                        .addGap(25, 25, 25)
                        .addComponent(countryAvgbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(countryRank0lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryRank1lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryRank2lbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(countryName0lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryName1lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryName2lbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(countryTime0lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryTime1lbl)
                                .addGap(18, 18, 18)
                                .addComponent(countryTime2lbl)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDatabtnActionPerformed
        //Read from the text fie
        try{
            FileReader file = new FileReader("ics3urunning.dat");
            try (BufferedReader buffer = new BufferedReader(file)) {
                for (int i = 0; i <=7; i++){
                    //Puts each line of info read into an element of an array
                    runnerInfo[i] = buffer.readLine();
                }
            }
            //Datapulled = true so that you cannot press "sort" before pulling the data
            dataPulled = true;
            //Calls the method that displays all of the data
            displayData(runnerInfo);
            //Calls the method that gets the times from the info
            getTimes();
        }
        
        //Catch IO exceptions
        catch(IOException e){
            System.err.println("Sorry, file not found");   
        }
    }//GEN-LAST:event_getDatabtnActionPerformed

    private void findWinnerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findWinnerbtnActionPerformed
        //Calls the method that sorts the data to find the winner
        //If the data has not yet been read and put in the array, you get an error message
        if (dataPulled == true){
        bubbleSortRunners(times);
        }
        else{
            System.err.println("You must get data first!");
        }
    }//GEN-LAST:event_findWinnerbtnActionPerformed

    private void countryAvgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryAvgbtnActionPerformed
        //Calls the method that calculates the average times for countries, again cannot be done unless data has been read
        try{
        countryAverages();
        }
        catch(NullPointerException e){
            System.err.println("You must get data first!");
        }
    }//GEN-LAST:event_countryAvgbtnActionPerformed
 /*
 * This method calculates the average time in seconds for each country 
 */
    public void countryAverages(){
        for (int i = 0; i <=7; i++){
            //Converting Time to seconds
            timeInSeconds(i);
             //Checks the last 3 letters to identify the country
             int length = (runnerInfo[i].length());
             char thirdLastChar = runnerInfo[i].charAt(length-3);
             char secondLastChar = runnerInfo[i].charAt(length-2);
             char lastChar = runnerInfo[i].charAt(length-1);
             
             //Putting country names in the array
             countries[0] = "Kenya";
             countries[1] = "Japan";
             countries[2] = "Eritrea";
             
             //If the country is Kenya
             if(thirdLastChar == 'n' && secondLastChar == 'y' && lastChar =='a'){
                kenyaRunners+=1;
                kenyaSecs +=timeInSeconds[i];
         }
             //If the country is Japan
             if(thirdLastChar == 'p' && secondLastChar == 'a' && lastChar =='n'){
                japanRunners+=1;
                japanSecs +=timeInSeconds[i];
         }
             //If the country is Eritrea
             if(thirdLastChar == 'r' && secondLastChar == 'e' && lastChar =='a'){
                eritreaRunners+=1;
                eritreaSecs +=timeInSeconds[i];
         }                      
        }
        //Calculates country averages by dividing total number of seconds by number of runners
        countryAverages[0] = Integer.toString((int)kenyaSecs/kenyaRunners);
        countryAverages[1] = Integer.toString((int)japanSecs/japanRunners);
        countryAverages[2] = Integer.toString((int)eritreaSecs/eritreaRunners);
        bubbleSortCountries();
    }
/*
* This method converts the time in X:XX:XX format to an integer without the colons 
*/
    public void getTimes(){
        //Takes the first bit of information (the time) from the runnerInfo array, and converts it to an int
        for (int i = 0; i <=7; i++){
            //Empty string to hold the numbers
            String totalTime = "";
            //Converts the start of each element of the array into a smaller string
            String time = runnerInfo[i];
            //Takes the hours and adds it to the new number
            char hours = time.charAt(0);
            totalTime = (totalTime + hours);
            //Takes the tens of minutes and adds it to the new number
            char tenmins = time.charAt(2);
            totalTime = (totalTime + tenmins);
            //Takes the minutes and adds it to the new number
            char mins = time.charAt(3);
            totalTime = (totalTime + mins);
            //Takes the tens of seconds and adds it to the new number
            char tensecs = time.charAt(5);
            totalTime = (totalTime + tensecs);
            //Takes the seconds and adds it to the new number
            char secs = time.charAt(6);
            totalTime = (totalTime + secs);
            //Puts the new numbers into the times array
            times[i] = Integer.parseInt(totalTime);  
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICS3UCulminatingForm().setVisible(true);
            }
        });
    }
/*
* This method sorts the times from lowest to highest, and rearranges the runners information accordingly
* BubbleSort algorithm was adapted from https://www.javatpoint.com/bubble-sort-in-java
*/    

public void bubbleSortRunners(int times[]){
    int n = times.length;  
        int temp;  
        String temp2;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(times[j-1] > times[j]){  
                                 //swap elements, when times[] is changed, runnerInfo[] is changed accordingly 
                                 temp = times[j-1];
                                 temp2 = runnerInfo[j-1];
                                 times[j-1] = times[j];  
                                 runnerInfo[j-1] = runnerInfo[j];
                                 times[j] = temp;   
                                 runnerInfo[j] = temp2;
                         }     
                 }  
         }  
         displayData(runnerInfo);
         winnerInfolbl.setText(runnerInfo[0]);
         checkWR(times);        
}
/*
 * This method displays the data pulled from the text file on the GUI
 */
public void displayData(String runnerInfo[]){
    timelbl0.setText(runnerInfo[0]);
    timelbl1.setText(runnerInfo[1]);
    timelbl2.setText(runnerInfo[2]);
    timelbl3.setText(runnerInfo[3]);
    timelbl4.setText(runnerInfo[4]);
    timelbl5.setText(runnerInfo[5]);
    timelbl6.setText(runnerInfo[6]);
    timelbl7.setText(runnerInfo[7]);
    //Checks for world record and displays a message if it was broken
    if (WR == true){
             WRlbl.setText("A new world record has been set!");
         }
}
/*
* This method compares the fastest time from the race to the previous world record to test if it was broken
*/
public boolean checkWR(int times[]){
    if(times[0] < 20257){
        WR = true;
    }
    displayData(runnerInfo);
    return WR;
}
/*
* This method converts the time from X:XX:XX format into seconds and puts them into the timeInSeconds[] array
*/
public void timeInSeconds(int i){
    int time;
             //Hours
             char hours = runnerInfo[i].charAt(0);
             String a = String.valueOf(hours);
             int secondsAt0 = 3600* (Integer.parseInt(a));
             
             //Tens of Minutes
             char minutes10 = runnerInfo[i].charAt(2);
             String b = String.valueOf(minutes10);
             int secondsAt2 = 600* (Integer.parseInt(b));
             
             //Minutes
             char minutes1 = runnerInfo[i].charAt(3);
             String c = String.valueOf(minutes1);
             int secondsAt3 = 60* (Integer.parseInt(c));
             
             //Tens of seconds
             char seconds10 = runnerInfo[i].charAt(5);
             String d = String.valueOf(seconds10);
             int secondsAt5 = 10* (Integer.parseInt(d));
             
             //Seconds
             char seconds1 = runnerInfo[i].charAt(6);
             String e = String.valueOf(seconds1);
             int secondsAt6 = (Integer.parseInt(e));
             
             //Adding up seconds
             time = secondsAt0 + secondsAt2 + secondsAt3 + secondsAt5 + secondsAt6;
             timeInSeconds[i] = time;
}
/*
* This method is another bubbleSort, this time it sorts the average country times 
* and rearranges the country names accordingly
*/
public void bubbleSortCountries(){
        int n = countryAverages.length;  
        String temp;  
        String temp2;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if((Integer.parseInt(countryAverages[j-1])) > (Integer.parseInt(countryAverages[j]))){  
                                 //swap elements, when countryAverages[] is rearranged, countries[] is rearranged accordingly
                                 temp = countryAverages[j-1];
                                 temp2 = countries[j-1];
                                 countryAverages[j-1] = countryAverages[j];  
                                 countries[j-1] = countries[j];
                                 countryAverages[j] = temp;   
                                 countries[j] = temp2;
                         }     
                 }  
         } 
         secondsToTime();
         //outputs the countries, in order, to the GUI
         countryName0lbl.setText(countries[0]);
         countryName1lbl.setText(countries[1]);
         countryName2lbl.setText(countries[2]);
}
/*
* This method converts the time from total seconds back into X:XX:XX format
*/
public void secondsToTime(){
    String time = "";
    for (int i = 0; i<=2; i++){
        int hours = Integer.parseInt(countryAverages[i])/3600;
        int secondsLeft = Integer.parseInt(countryAverages[i])%3600;
        int minutes = secondsLeft / 60; 
        int seconds = secondsLeft % 60; 
        if (minutes < 10){
        time = (String.valueOf(hours) + ":0" + String.valueOf(minutes) + ":" + String.valueOf(seconds));
        }
        else{ 
            time = (String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds));
        }
        countryAverages[i] = time;
        displayCountryTimes();
    }
}
/*
* Outputs the country average times, in order, to the GUI
*/
public void displayCountryTimes(){
    countryTime0lbl.setText(countryAverages[0]);
    countryTime1lbl.setText(countryAverages[1]);
    countryTime2lbl.setText(countryAverages[2]);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WRlbl;
    private javax.swing.JLabel agelbl;
    private javax.swing.JLabel averageslbl;
    private javax.swing.JButton countryAvgbtn;
    private javax.swing.JLabel countryName0lbl;
    private javax.swing.JLabel countryName1lbl;
    private javax.swing.JLabel countryName2lbl;
    private javax.swing.JLabel countryRank0lbl;
    private javax.swing.JLabel countryRank1lbl;
    private javax.swing.JLabel countryRank2lbl;
    private javax.swing.JLabel countryTime0lbl;
    private javax.swing.JLabel countryTime1lbl;
    private javax.swing.JLabel countryTime2lbl;
    private javax.swing.JLabel countrylbl;
    private javax.swing.JButton findWinnerbtn;
    private javax.swing.JLabel fnamelbl;
    private javax.swing.JButton getDatabtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lnamelbl;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel timelbl0;
    private javax.swing.JLabel timelbl1;
    private javax.swing.JLabel timelbl2;
    private javax.swing.JLabel timelbl3;
    private javax.swing.JLabel timelbl4;
    private javax.swing.JLabel timelbl5;
    private javax.swing.JLabel timelbl6;
    private javax.swing.JLabel timelbl7;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel winnerInfolbl;
    private javax.swing.JLabel winnerlbl;
    // End of variables declaration//GEN-END:variables
}
