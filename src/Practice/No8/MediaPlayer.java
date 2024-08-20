package Practice.No8;

import java.lang.reflect.Array;
import java.util.Arrays;

class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {

        MediaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1);

        /*
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
        for (int i =0; i<mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        */

        //System.out.println(temp[mediaList.length]);
        temp[temp.length-1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        for (MediaPlayable playable:mediaList){

            playable.play();
        }
    }
}
