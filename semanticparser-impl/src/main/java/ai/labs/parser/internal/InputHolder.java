package ai.labs.parser.internal;

import ai.labs.parser.internal.matches.MatchMatrix;
import ai.labs.parser.internal.matches.MatchingResult;
import ai.labs.parser.internal.matches.Suggestion;

import java.util.Iterator;
import java.util.List;

public class InputHolder {
    public String[] input;
    public Integer index = 0;
    private MatchMatrix matchMatrix = new MatchMatrix();

    void addMatch(int index, String inputTerm, MatchingResult matchingResult) {
        matchMatrix.addMatchingResult(index, inputTerm, matchingResult);
    }

    int getMatchingResultSize(int index) {
        List<MatchingResult> matchingResults = matchMatrix.getMatchingResults(index);
        return matchingResults != null ? matchingResults.size() : 0;
    }

    Iterator<Suggestion> createSolutionIterator() {
        return matchMatrix.iterator();
    }
}
