package com.man.introduction.service;

import com.man.introduction.dto.BoardDTO;
import com.man.introduction.entity.BoardEntity;
import com.man.introduction.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//DTO -> Entity (Entity Class)
//Entity -> DTO (DTO Class)
@Service
@RequiredArgsConstructor // final 필드를 가진 생성자를 만들어줌
public class BoardService {

    private  final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        //toEntity() 메소드를 사용해서 BoardDTO를 BoardEntity로 변환
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
