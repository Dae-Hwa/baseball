import styled from "styled-components";
import Score from "./Score";
import Field from "./Field";

const Ground = ({ data, fetchData, teamId }) => {
	const userTeam = data.awayTeam.id === teamId ? "AWAY" : "HOME";
	return (
		<StyledGround>
			<Score {...data} userTeam={userTeam} />
			<Field data={data} fetchData={fetchData} userTeam={userTeam} />
		</StyledGround>
	);
};

const StyledGround = styled.div`
	width: 960px;
	height: 720px;
	border-right: 3px solid gray;
`;

export default Ground;
