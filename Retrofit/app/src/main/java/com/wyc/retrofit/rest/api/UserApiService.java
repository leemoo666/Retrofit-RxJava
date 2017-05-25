package com.wyc.retrofit.rest.api;


/**
 * User related API service, such as login, register
 */
public interface UserApiService {

//    //获取收藏列表
////    @GET("collection/get")
////    Call<BaseResponse<BaseCollect>> getCollect();
//
//    //获取收藏小节列表
//    @GET("collection/chapters/get")
//    Call<BaseResponse<BaseChapters>> getCollectChapters(
//            @Query("token") String token
//    );
//
//    //获取收藏问题列表
//    @GET("collection/questions/get")
//    Call<BaseResponse<BaseExercises>> getCollectQuestion(
//            @Query("token") String token
//    );
//
//    //获取首页
//    @POST("home")
//    Call<BaseResponse<BaseHome>> getHome(
//            @Query("token") String token,
//            @Body HomeRequest labelId);
//
//    //反馈
//    @POST("feedback/post")
//    Call<BaseResponse<BaseData>> postFeedBak(
//            @Query("token") String token,
//            @Body RequestFeedBack feedback
//    );
//
//    @GET("score/history")
//    Call<BaseResponse<BaseScore>> getScore(
//            @Query("token") String token
//
//    );
//
//    //绑定学员编号
//    @POST("user/bindDFSS")
//    Call<BaseResponse<BaseData>> bindStudentNumber(
//            @Query("token") String token,
//            @Body BindStudentNumber body);
//
//    //小节list列表
//    @GET("chapter/list")
//    Call<BaseResponse<SectionListData>> loadSectionList(
//            @Query("token") String token,
//            @Query("courseId") String courseId
//    );
//
//    //小节list列表
//    @GET("chapter/list")
//    Call<BaseResponse<SectionGroupData>> loadSectionGroup(
//            @Query("token") String token,
//            @Query("courseId") String courseId
//    );
//
//
//    //小节详情--列表展示
//    @GET("chapter/info/get")
//    Call<BaseResponse<Chapter>> loadSectionDetail(
//            @Query("token") String token,
//            @Query("chapterId") String chapterId
//    );
//
//    //小节详情--收藏
//    @POST("collection/post")
//    Call<BaseResponse<BaseData>> loadCollection(
//            @Query("token") String token,
//            @Body Collection body);
//
//    //讨论区点赞--点赞
//    @POST("comment/praise")
//    Call<BaseResponse<BaseData>> loadPraise(
//            @Query("token") String token,
//            @Query("commentId") String commentId,
//            @Query("action") int action
//    );
//
//    //小节详情--点赞
//    @POST("chapter/praise")
//    Call<BaseResponse<BaseData>> loadChapterPraise(
//            @Query("token") String token,
//            @Body PraiseChapter body);
//
//    //            @Query("chapterId") String chapterId,
////            @Query("action") int action
////    );
//    //小节--练习题
//    @GET("chapter/questions/get")
//    Call<BaseResponse<ExerciseListData>> loadExerciseList(
//            @Query("token") String token,
//            @Query("chapterId") String chapterId
//    );
//
//    //课程--列表
//    @GET("course/questionset/{courseId}")
//    Call<BaseResponse<ExerciseListData>> loadCourseExerciseList(
//            @Path("courseId") String aa,
//            @Query("token") String token);
//
//    //收藏--列表
//    @GET("collection/question/get")
//    Call<BaseResponse<ExerciseListData>> requestCollectionList(
//            @Query("token") String token,
//            @Query("courseId") String courseId
//    );
//
//    //2.3 错题--列表
//    @GET("question/wrong/get")
//    Call<BaseResponse<WrongQuestions>> getWrongQuestions(
//            @Query("token") String token,
//            @Query("courseId") String courseId
//    );
//
//
//    //小节--练习题(上报小节学习记录)
//    @POST("chapter/studylog")
//    Call<BaseResponse<BaseData>> loadReportRecord(
//            @Query("token") String token,
//            @Body ReportChapterRecord body
//
//    );
//    //@Body ReportChapterRecord body
//
//    //小节--上报题目回答情况
//    @POST("question/result")
//    Call<BaseResponse<BaseData>> loadExerciseStatus(
//            @Query("token") String token,
//            @Body ReportExerciseStatus body);
//
//    //课程--上报错题情况
//    @POST("question/wrong/insertOrUpdate")
//    Call<BaseResponse<BaseData>> reportErrorExercise(
//            @Query("token") String token,
//            @Body ReportErrorExercise body
//    );
//
//    //课程--增加收藏
//    @POST("collection/question/insert")
//    Call<BaseResponse<BaseData>> addCollection(
//            @Query("token") String token,
//            @Body AddCollection body
//    );
//
//    //课程--删除收藏
//    @POST("collection/question/delete")
//    Call<BaseResponse<BaseData>> deleteCollection(
//            @Query("token") String token,
//            @Body DeleteCollection body
//    );
//
//    //课程--新增错题
//    @POST("question/wrong/insertOrUpdate")
//    Call<BaseResponse<BaseData>> addErrorExercise(
//            @Query("token") String token,
//            @Body ErrorExercise body
//    );
//
//    //错题--删除错题
//    @POST("question/wrong/delete")
//    Call<BaseResponse<BaseData>> deleteErrorExercise(
//            @Query("token") String token,
//            @Body ErrorExercise body
//    );
//
//
//    //课程--上报课程测试完成结果
//    @POST("course/uploadTestStatus")
//    Call<BaseResponse<BaseData>> pushCourseTestComplete(
//            @Query("token") String token,
//            @Body CourseStatus body);
//
//    //讨论区--列表
//    @GET("comment/get")
//    Call<BaseResponse<DisscussListData>> loadDisscussList(
//            @Query("token") String token,
//            @Query("commentType") int commentType,
//            @Query("relatedId") String relatedId
//    );
//
//    //讨论区--写评论
//    @POST("comment/post")
//    Call<BaseResponse<BaseData>> loadWriteComment(@Query("token") String token,
//                                                  @Body WriteComment body);
//
//    //讨论区--点赞
//    @POST("comment/praise")
//    Call<BaseResponse<BaseData>> loadDisscussPraise(@Query("token") String token,
//                                                    @Body PraiseDisscuss body);
//
//    //搜索
//    @GET("search")
//    Call<BaseResponse<SearchDataList>> loadSearchList(
//            @Query("token") String token,
//            @Query("keyword") String keyword);
//
//    //课程--测试题
//    @GET("user/userinfo/get")
//    Call<BaseResponse<User>> loadPersonInfo(
//            @Query("token") String token
//    );
//
//
//    @GET("sysVersion/check")
//    Call<BaseResponse<ResponseVersion>> checkVersion(
//            @Query("token") String token,
//            @Query("platform") String platform
//    );
//
//    //上报小节学习进度
//    @POST("chapter/haveLearned")
//    Call<BaseResponse<BaseData>> haveLearned(
//            @Query("token") String token,
//            @Body RequestLearned learend
//    );


}