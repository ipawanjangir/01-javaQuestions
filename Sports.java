import java.net.Socket;

class Sports {
    public void play() {
        System.out.println("everyone  play are outdoor game because it very healthy for human body");
    }
}

class Football extends Sports {
    public void play() {
        System.out.println("football is a outdoor game ");
    }
}

class Basketball extends Sports {
    public void play() {
        System.out.println("basket ball game are outdoor game this game are good exercise game");
    }
}

class Rugby extends Sports {
    public void play() {
        System.out.println("rubgy are is good game ");
    }

    public static void main(String[] args) {
        Sports s = new Sports();
        s.play();

        Football f = new Football();
        f.play();

        Basketball b = new Basketball();
        b.play();

        Rugby r = new Rugby();
        r.play();
    }
}

// Football, Basketball, and Rugby.