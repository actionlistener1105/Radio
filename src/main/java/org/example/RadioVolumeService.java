package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioVolumeService {

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;

    private int currentSoundVolume = 0;

    public void nextVolume(){
        if (currentSoundVolume == MAX_VOLUME){
            return;
        }else this.currentSoundVolume++;
    }

    public void prevVolume(){
        if(currentSoundVolume == MIN_VOLUME){
            return;
        }else this.currentSoundVolume--;
    }


    public void setCurrentSoundVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.currentSoundVolume = volume;
        }else return;
    }
}
