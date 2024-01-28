public class Television {
    private int channel;
    private boolean isOn;
    public Television() {
        channel = 1;
        isOn = false;
    }

    public void setChannel(int newChannel) {
        if (newChannel > 10)
            this.channel = 1;
        else {
            this.channel = newChannel;
        }
    }
    public int getChannel() {
        return channel;
    }
    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}

// Path: Module2/Module2.1/src/TelevisionViewer.java