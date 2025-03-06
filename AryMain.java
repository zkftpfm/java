import siat.study.PostDTO;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostResponseDTO;

public class AryMain {
    public static void main(String[] args) {
        // 배열(Array)
        // []
        // 고정길이
        // 단일 타입만 담는 그릇
        // 리사이징이 안됨
        // length
        // 참조타입으로 취급됨

        int[] ary = new int[10];
        System.out.println("배열의 길이 :"+ary.length);
        for(int idx=0 ; idx < ary.length ; idx++) {
            System.out.println(ary[idx]);
        }
        System.out.println(">>>> enhanced loop");
        for(int data: ary) {
            System.out.println(data);
        }

        System.out.println(">>>> 참조타입의 객체를 배열에 담는다면?");
        PostDTO dto = PostDTO.builder()
                            .title("assd")
                            .build();

        PostDTO [] dtoAry = new PostDTO [10] ;
        dtoAry[0] = dto ;
        dtoAry[1] = dto ;
        dtoAry[2] = dto ;

        // ~~~~~

        for(PostDTO entity : dtoAry){
            if( entity != null) {
                System.out.println(entity.getTitle());
            }
        }

        // 퀴즈) PostDAO 객체 생성후 selectrow() 메서드 호출후 출력
        PostDAO dao = PostDAO.builder().build();
        PostResponseDTO[] responseAry = dao.selectRow() ;
        System.out.println(">>> 게시글 출력");
        for (PostResponseDTO entity : responseAry ){
            System.out.println(entity);
        }

    }
}
