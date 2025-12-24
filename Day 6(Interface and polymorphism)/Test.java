class Test{
    public static void main(String[] args){
        MusicPlayer m = new MusicPlayer();
        VideoPlayer v = new VideoPlayer();
        
        m.play();
        v.play();
    }
}

interface Playable{
    void play();
}

class MusicPlayer implements Playable{
    public void play(){
        System.out.println("You are using a Music PLayer");
    }
}

class VideoPlayer implements Playable{
    public void play(){
        System.out.println("You are using a Video Player");
    }
}
