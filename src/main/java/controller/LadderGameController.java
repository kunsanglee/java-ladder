package controller;

import domain.Height;
import domain.Ladder;
import domain.Players;
import domain.booleangenerator.BooleanGenerator;
import java.util.List;
import view.InputView;
import view.OutputView;

public class LadderGameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final BooleanGenerator booleanGenerator;

    public LadderGameController(InputView inputView, OutputView outputView, BooleanGenerator booleanGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.booleanGenerator = booleanGenerator;
    }

    public void run() {
        List<String> inputNames = inputView.readPlayerNames();
        Players players = new Players(inputNames);
        int inputHeight = inputView.readHeight();
        Height height = new Height(inputHeight);

        Ladder ladder = new Ladder(players, height, booleanGenerator);

        outputView.printResult(ladder, players.getNames());
    }
}
