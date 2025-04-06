public class Band {
    private Playable[] playableObjects = {new Drum(), new Guitar()};
    public void playAll() {
        for (Playable playable : playableObjects) {
            playable.play();
        }
    }
}
