INSERT INTO article(id, title, content) VALUES(1,'첫번째 데이터','이것이 첫번째');
INSERT INTO article(id, title, content) VALUES(2,'두번째 데이터','이것이 두번째');
INSERT INTO article(id, title, content) VALUES(3,'세번째 데이터','이것이 세번째');

--article 더미 데이터 추가
INSERT INTO article(id, title, content) VALUES(4,'당신의 인생 영화는','댓글 작성');
INSERT INTO article(id, title, content) VALUES(5,'당신의 소울 푸드는','댓글 작성');
INSERT INTO article(id, title, content) VALUES(6,'당신의 취미는','댓글 작성');

--comment더미 데이터
--4번 게시글의 댓글들
INSERT INTO comment(id,article_id, nickname, body) VALUES(1,4,'Park','인셉션');
INSERT INTO comment(id,article_id, nickname, body) VALUES(2,4,'Kim','쇼생크탈출');
INSERT INTO comment(id,article_id, nickname, body) VALUES(3,4,'Choi','어거스트러쉬');

--5번 게시글의 댓글들
INSERT INTO comment(id,article_id, nickname, body) VALUES(4,5,'Park','치킨');
INSERT INTO comment(id,article_id, nickname, body) VALUES(5,5,'Kim','샤브샤브');
INSERT INTO comment(id,article_id, nickname, body) VALUES(6,5,'Choi','초밥');

--6번 게시글의 댓글들
INSERT INTO comment(id,article_id, nickname, body) VALUES(7,6,'Park','조깅');
INSERT INTO comment(id,article_id, nickname, body) VALUES(8,6,'Kim','유튜브');
INSERT INTO comment(id,article_id, nickname, body) VALUES(9,6,'Choi','독서');