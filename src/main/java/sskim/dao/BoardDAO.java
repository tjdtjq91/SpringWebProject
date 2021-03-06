package sskim.dao;

import sskim.domain.BoardVO;
import sskim.domain.Criteria;
import sskim.domain.SearchCriteria;

import java.util.List;

public interface BoardDAO {
    public void create(BoardVO vo) throws Exception;

    public BoardVO read(int bno) throws Exception;

    public void update(BoardVO vo) throws Exception;

    public void delete(int bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;

    public List<BoardVO> listPage(int page) throws Exception;

    public List<BoardVO> listCriteria(Criteria cri) throws Exception;

    public int countPaging(Criteria cri) throws Exception;

    public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;

    public int listSearchCount(SearchCriteria cri) throws Exception;

    public void updateReplyCnt(int bno, int amount) throws Exception;

    public void updateViewCnt(int bno) throws Exception;

    //게시물 파일 업로드
    public void addAttach(String fullName) throws Exception;

    public List<String> getAttach(int bno) throws Exception;

    public void deleteAttach(int bno) throws Exception;

    public void replaceAttach(String fullName, int bno) throws Exception;
}
