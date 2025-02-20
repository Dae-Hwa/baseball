import styled from "styled-components";
import TeamSelect from "./TeamSelect";

const Intro = () => {
  // loginStatus true 일때만 아래 렌더링
  return (
    <StyledIntro>
      <Title>Baseball Game Online</Title>
      <TeamSelect />
    </StyledIntro>
  );
};

const StyledIntro = styled.div`
  height: 720px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-evenly;
`;
const Title = styled.div`
  font-weight: 900;
  font-size: 40px;
  line-height: 58px;
  letter-spacing: -0.04em;
  text-transform: uppercase;
  color: #fff;
`;

export default Intro;
