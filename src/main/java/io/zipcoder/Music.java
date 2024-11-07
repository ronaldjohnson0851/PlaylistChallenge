package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
            startIndex = 1;
            int jumpsForward = 0;
            for (int i = startIndex; i < playList.length; i++) {
                if (playList[i] != selection) {
                    jumpsForward += 1;
                } return jumpsForward;
            }
            return jumpsForward - playList.length;
    }
}
