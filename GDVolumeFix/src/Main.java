import com.alphalaneous.SaveExplorer;
import com.alphalaneous.SaveValue;

import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {
        SaveExplorer.loadSave();

        SaveExplorer.getGameManager().put("sfxVolume", new SaveValue('r', 0));
        SaveExplorer.getGameManager().put("bgVolume", new SaveValue('r', 0));

        SaveExplorer.updateGameManager();
    }
}
