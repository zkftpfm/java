import siat.study.PostDTO;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostRequestDTO;
import siat.study.service.PostService;
import siat.study.view.PostView;

public class PostMain {
    public static void main(String[] args) {


        PostView view = PostView.builder()
                            .dao(PostDAO.builder()
                                        .requestAry(new PostRequestDTO[10])
                                        .build())
                        .build();
        view.menu();


        // PostService service = PostService.builder()
        //                                 .build();
        // String saveMsg = service.savePost();
        // System.out.println(saveMsg);
        // String updateMsg = service.updatePost();
        // System.out.println(updateMsg);
        // String deleteMsg = service.deletePost();
        // System.out.println(deleteMsg);


        // PostView view = PostView.builder()
        //                         .build();
        // view.menu();

        // PostDTO dto = new PostDTO();
        // dto.setTitle("드래곤볼");
        // dto.setWriter("누구지");
        // dto.setContent("없다");
        // dto.setRegDate("2025년");
        // dto.setViewCnt("0");

        // PostDTO dto = PostDTO.builder()
        //                         .title("드래곤볼")
        //                         .build();

        // System.out.printf("제목 : %s , 작성자 : %s, 작성일 : %s, 조회수 : %s", dto.getTitle(), dto.getWriter(), dto.getRegDate(), dto.getViewCnt());
    }
}
