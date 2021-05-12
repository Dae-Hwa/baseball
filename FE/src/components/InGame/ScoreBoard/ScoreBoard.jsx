import styled from "styled-components";
import Table from "./Table";
import useFetch from "../../../utils/useFetch/useFetch";

const ScoreBoard = ({ gameId, slide, toggle, isDark, setDark }) => {
	const { data, fetchData } = useFetch({ url: `https://baseball-ahpuh.herokuapp.com/games/${gameId}/scores`, initialValue: { awayTeam: { name: "", scores: [] }, homeTeam: { name: "", scores: [] } } });

	const slideScoreBoard = async () => {
		if (isDark) return;
		await fetchData()
		toggle(true);
		setDark(true);
	};
	return (
		<StyledScoreBoard>
			<NearChecker onMouseEnter={slideScoreBoard} />
			<Table slide={slide} data={data} />
		</StyledScoreBoard>
	);
};
const StyledScoreBoard = styled.div``;
const NearChecker = styled.div`
	position: absolute;
	width: 1280px;
	height: 40px;
`;

export default ScoreBoard;
