package kr.codesquad.baseball.utils;

import kr.codesquad.baseball.game.GameDTO;
import kr.codesquad.baseball.game.GameScoresDTO;
import kr.codesquad.baseball.game.LineUpDTO;
import kr.codesquad.baseball.game.PlayerStatus;
import kr.codesquad.baseball.inning.BaseState;
import kr.codesquad.baseball.inning.HitterRecord;
import kr.codesquad.baseball.inning.InningDTO;
import kr.codesquad.baseball.player.PlayerDTO;
import kr.codesquad.baseball.team.TeamDTO;

import java.util.Arrays;
import java.util.List;

public class SampleDataFactory {
    private SampleDataFactory() {
    }

    public static List<GameDTO> gameReadAllResponses() {
        return Arrays.asList(
                new GameDTO(1L, new TeamDTO(1L, "Captain"), new TeamDTO(2L, "Marvel")),
                new GameDTO(2L, new TeamDTO(3L, "Twins"), new TeamDTO(4L, "Tigers")),
                new GameDTO(3L, new TeamDTO(5L, "Rockets"), new TeamDTO(6L, "Dodgers")),
                new GameDTO(4L, new TeamDTO(7L, "United"), new TeamDTO(8L, "City")),
                new GameDTO(5L, new TeamDTO(9L, "Wolves"), new TeamDTO(10L, "Dragons")),
                new GameDTO(6L, new TeamDTO(11L, "Reds"), new TeamDTO(12L, "Lions"))
        );
    }

    public static InningDTO inningDTO() {
        return new InningDTO(
                2,
                "TOP",
                new TeamDTO.WithScore(1L, "Captain", 1),
                new TeamDTO.WithScore(2L, "Marvel", 5),
                new BaseState(false, true, true),
                new PlayerDTO.Pitcher(8L, "최동원", 39),
                new PlayerDTO.Hitter(16L, "류현진", 7, 1, 0),
                Arrays.asList(
                        new HitterRecord(
                                16L,
                                7,
                                "류현진",
                                Arrays.asList("S", "B", "B", "B", "S"),
                                true
                        ), new HitterRecord(
                                15L,
                                6,
                                "이용대",
                                Arrays.asList("S", "B", "B"),
                                false
                        ), new HitterRecord(
                                14L,
                                5,
                                "추신수",
                                Arrays.asList("S", "S", "B", "S"),
                                true
                        )
                )
        );
    }

    public static LineUpDTO lineUp() {
        return new LineUpDTO(
                new TeamDTO.WithPlayerStatus(
                        1L,
                        "Captain",
                        Arrays.asList(
                                new PlayerStatus(
                                        1L,
                                        "김광진",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        2L,
                                        "이동규",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        3L,
                                        "김진수",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        4L,
                                        "박영권",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        5L,
                                        "추신수",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        6L,
                                        "이용대",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        7L,
                                        "류현진",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        8L,
                                        "최동수",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        9L,
                                        "한양범",
                                        1,
                                        1
                                )
                        )
                ),
                new TeamDTO.WithPlayerStatus(
                        2L,
                        "Marvel",
                        Arrays.asList(
                                new PlayerStatus(
                                        10L,
                                        "김광진",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        11L,
                                        "이동규",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        12L,
                                        "김진수",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        13L,
                                        "박영권",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        14L,
                                        "추신수",
                                        1,
                                        1
                                ), new PlayerStatus(
                                        15L,
                                        "이용대",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        16L,
                                        "류현진",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        17L,
                                        "최동원",
                                        1,
                                        0
                                ), new PlayerStatus(
                                        18L,
                                        "한양범",
                                        1,
                                        1
                                )
                        )
                )
        );
    }

    public static GameScoresDTO gameScores() {
        return new GameScoresDTO(
                new TeamDTO.WithScores(
                        1L,
                        "Captain",
                        Arrays.asList(1, 2, 2)
                ),
                new TeamDTO.WithScores(
                        2L,
                        "Marvel",
                        Arrays.asList(1, 0, 0, 0)
                )
        );
    }
}
