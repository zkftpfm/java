package siat.study.post.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import siat.study.post.domain.PostRequestDTO;
import siat.study.post.domain.PostResponseDTO;

// xxxDAO(Data Access Object)로 DBMS와 작업을 전담하는 역활
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDAO {

    private PostRequestDTO[] requestAry ;
    private int idx ;
    
    public void insertRow(PostRequestDTO request) {
        requestAry[idx++] = request;
    }
    
    public PostRequestDTO[] selectRow() {
            return requestAry;

        }
        // PostResponseDTO entity = PostResponseDTO.builder()
        //                                 .title("abc")
        //                                 .writer("ddd")
        //                                 .content("asdw")
        //                                 .viewCnt(0)
        //                                 .build();
        // PostResponseDTO[] ary = new PostResponseDTO[10];
        // ary[0] = entity;
        // ary[1] = entity;
        // return ary;
        // }
    }

