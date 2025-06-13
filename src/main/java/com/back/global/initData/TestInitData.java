package com.back.global.initData;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
@RequiredArgsConstructor
public class TestInitData {
//    @Autowired
//    @Lazy
//    private TestInitData self;
//    private final PostService postService;
//
//    @Bean
//    ApplicationRunner testInitDataApplicationRunner() {
//        return args -> {
//            if (postService.count() >= 4) return;
//
//            Post post1 = postService.write(3,"제목 3", "내용 3");
//            Post post2 = postService.write(3,"제목 4", "내용 4");
//
//            System.out.println("테스트용 데이터가 초기화되었습니다.");
//        };
//    }
}
