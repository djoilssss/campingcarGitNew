package kr.co.ccrent.service;

import java.util.List;

import kr.co.ccrent.dto.FaqBoardDTO;
import kr.co.ccrent.dto.GarageDTO;
import kr.co.ccrent.dto.Criteria;


public interface FaqBoardService {

	//글 추가
	public void register(FaqBoardDTO boardDTO);
	
	//글 상세보기
	public FaqBoardDTO read(int bno);
		
	//글 수정하기
	public void modify(FaqBoardDTO boardDTO);
	
	//글 지우기
	public int remove(int bno);
	
	//public List<FaqBoardDTO> getList();
	
	//글 목록
	public List<FaqBoardDTO> getAll(Criteria cri) throws Exception;
	
	public int getAll_Count(Criteria cri) throws Exception;
	
	public List<FaqBoardDTO> faq_get(Criteria cri)throws Exception;
	public int faq_get_count(Criteria cri)throws Exception;
	
}
