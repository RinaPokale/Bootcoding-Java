package com.bootcoding.java.Assignment;

public class BirdWatcher {
    private int[] birdsPerDay = new int[7];

    BirdWatcher(int[] birdsPerDay){
        this.birdsPerDay = birdsPerDay;
    }

//    1. Check what the counts were last week
    private int[] getLastWeek(){
        return this.birdsPerDay;
    }

//    2. Check how many birds visited today
    private int getToday(){
        return birdsPerDay[birdsPerDay.length-1];
    }

//    3. Increment today's count
    private int incrementTodaysCount(){
        int todaysBird = getToday();
        return todaysBird+1;
    }

//    4. Check if there was a day with no visiting birds
    private boolean hasDayWithoutBirds(){
        for(int b: birdsPerDay){
            if (b == 0){
                return true;
            }
        }
        return false;
    }

//    5. Calculate the number of visiting birds for the first number of days
    private int getCountForFirstDays(int limit){
        int count = 0;
        for(int i = 0; i < limit; i++){
            count += birdsPerDay[i];
        }
        return count;
    }

//    6. Calculate the number of busy days
    private int getBusyDays(){
        int count = 0;
        for(int b: birdsPerDay){
            if(b >= 5){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 2, 7, 4, 3};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        int[] lastWeekBirds = birdWatcher.getLastWeek();
        System.out.println("Last Week Birds");
        for(int b: lastWeekBirds)
            System.out.print(b + " ");

        System.out.println();
        System.out.println("Number of birds visited today");
        System.out.println(birdWatcher.getToday());

        System.out.println("increment Today's Count");
        System.out.println(birdWatcher.incrementTodaysCount());

        System.out.println("a day with no visiting birds");
        System.out.println(birdWatcher.hasDayWithoutBirds());

        System.out.println("number of visiting birds for the first number of days");
        System.out.println(birdWatcher.getCountForFirstDays(3));

        System.out.println("number of busy days");
        System.out.println(birdWatcher.getBusyDays());
    }
}
