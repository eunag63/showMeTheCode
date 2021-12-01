package com.sparta.showmethecode.repository.dao;

import com.sparta.showmethecode.domain.ReviewAnswer;
import com.sparta.showmethecode.dto.response.ReviewAnswerResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReviewAnswerDao {

    // 현재 답변에 평가가 됐는지 조회
    boolean isEvaluated(Long answerId);
    // 현재 사용자의 답변인지 확인
    boolean isMyAnswer(Long reviewerId, Long answerId);
}
