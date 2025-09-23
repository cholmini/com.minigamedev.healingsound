package com.minigamedev.healingsound.model;

import com.minigamedev.healingsound.constant.MusicConst;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MusicList {

    //region 변수
    private static MusicList instance;
    public ArrayList<MusicVO> arrMusicList = new ArrayList<>();

    public ArrayList<MusicVO> arrFilteredMusicList = new ArrayList<>();
    //endregion

    private MusicList(){
        makeMusicList();
    }

    public static MusicList getInstance() {
        if(instance == null) {
            instance = new MusicList();
        }
        return instance;
    }

    // 음악정보 배열생성 (여기에서 앱에 표시될 음악을 추가/삭제)
    private void makeMusicList() {
        // 함수 앞// 그룹명// 함수 뒤,제목,Keyword,재생시간,음악 파일명(MP3),LIST 파일명(JPG),플레이어 파일명(GIF),

        addMusicList(MusicConst.type.Meditation4.name(),"끝없이 펼쳐진 자유의 공간, 넓은 하늘은 무한한 가능성을 담고 있습니다.","☁️ 넓은 하늘","240","mp3_list_01","jpg_list_01","gif_list_01");
        addMusicList(MusicConst.type.Meditation4.name(),"미소처럼 환하게 열린 푸른 하늘. 하루의 시작을 밝히는 멜로디입니다.","☀️ 푸른 하늘","240","mp3_list_02","jpg_list_02","gif_list_02");
        addMusicList(MusicConst.type.Meditation4.name(),"눈부신 햇살이 따뜻하게 스며드는 순간, 햇살이 내리는 날은 하루를 환하게 밝혀줍니다.","☀️ 햇살이 내리는 날","240","mp3_list_03","jpg_list_03","gif_list_03");
        addMusicList(MusicConst.type.Meditation4.name(),"밤하늘에 춤추는 빛의 심포니, 신비한 오로라는 눈과 귀를 동시에 매혹합니다.","✨ 신비한 오로라","240","mp3_list_04","jpg_list_04","gif_list_04");
        addMusicList(MusicConst.type.Meditation4.name(),"꿈결 같은 색채가 번져가는, 몽환적인 오로라는 상상의 하늘을 노래합니다.","✨ 몽환적인 오로라","240","mp3_list_05","jpg_list_05","gif_list_05");
        addMusicList(MusicConst.type.Meditation5.name(),"흘러가는 시간 속에 담긴 순간들, 시계는 잊고 있던 추억을 하나하나 불러냅니다.","⏰ 시계","109","mp3_list_06","jpg_list_06","gif_list_06");
        addMusicList(MusicConst.type.Meditation5.name(),"작은 톱니가 맞물리며 세상을 움직이듯, 톱니바퀴는 반복 속의 리듬을 노래합니다.","⚙️ 톱니바퀴","240","mp3_list_07","jpg_list_07","gif_list_07");
        addMusicList(MusicConst.type.Meditation5.name(),"가벼운 걸음과 함께하는 작은 여행, 산책은 일상 속 숨겨진 여유를 전합니다.","🚶 산책","240","mp3_list_08","jpg_list_08","gif_list_08");
        addMusicList(MusicConst.type.Meditation6.name(),"별빛이 스며든 듯 은은한 멜로디, 자장가는 지친 마음을 조용히 감싸 안습니다.","🎶 자장가","478","mp3_list_09","jpg_list_09","gif_list_09");
        addMusicList(MusicConst.type.Meditation6.name(),"한 음 한 음이 따뜻하게 번져가는, 조용한 피아노는 마음의 먼지를 털어내는 선율입니다.","🎹 조용한 피아노","234","mp3_list_10","jpg_list_10","gif_list_10");
        addMusicList(MusicConst.type.Meditation7.name(),"분주한 불빛마저 잠든 듯, 차분한 도시는 고요한 위로를 전해줍니다.","🏙️ 차분한 도시","89","mp3_list_11","jpg_list_11","gif_list_11");
        addMusicList(MusicConst.type.Meditation7.name(),"추억과 웃음이 켜켜이 쌓인 학교의 교실. 그 따뜻함이 멜로디로 흐릅니다.","🏫 학교의 교실","63","mp3_list_12","jpg_list_12","gif_list_12");
        addMusicList(MusicConst.type.Meditation8.name(),"작은 어둠 속에서도 빛나는 별빛처럼, 작은 밤은 은은한 희망을 전합니다.","🌙 작은 밤","240","mp3_list_13","jpg_list_13","gif_list_13");
        addMusicList(MusicConst.type.Meditation8.name(),"고요 속에서 나를 마주하는, 혼자만의 밤은 사색의 멜로디입니다.","🌌 혼자만의 밤","240","mp3_list_14","jpg_list_14","gif_list_14");
        addMusicList(MusicConst.type.Meditation8.name(),"하루를 따뜻하게 감싸 안는, 포근한 밤은 내일을 약속하는 곡입니다.","🌙 포근한 밤","240","mp3_list_15","jpg_list_15","gif_list_15");

        arrFilteredMusicList = arrMusicList;
    }

    /**
     * 배열에 음악정보 추가
     * @param _type 음악 타입
     * @param _title 음악 제목
     * @param _composer 음악 작곡가
     * @param _playTimeSec 음악 플레이시간(초)
     * @param _musicFileName 음악 파일명
     * @param _imgFileName 음악 커버 이미지 파일명
     * @param _bgFileName 음악 gif 이미지 파일명
     */
    private void addMusicList(String _type, String _title, String _composer, String _playTimeSec, String _musicFileName, String _imgFileName, String _bgFileName) {
        MusicVO vo = new MusicVO(_type, _title, _composer, _playTimeSec, _musicFileName, _imgFileName, _bgFileName);
        arrMusicList.add(vo);
    }

    // 음악 타입에 해당하는 목록 필터
    public void filterMusicList(String _type) {
        if (_type.equals(MusicConst.type.All.name())) {
            arrFilteredMusicList = arrMusicList;
        } else
            arrFilteredMusicList = (ArrayList<MusicVO>) arrMusicList.stream().filter(music -> music.getType().equals(_type)).collect(Collectors.toList());
    }
}
