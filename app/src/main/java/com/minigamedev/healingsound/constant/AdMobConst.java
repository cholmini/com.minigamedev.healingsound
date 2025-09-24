package com.minigamedev.healingsound.constant;

public class AdMobConst {
    // 광고 아이디
    public enum ADID {
        // 띠배너
        BANNER("ca-app-pub-1135958776171939/4101762344"),
        // 전면
        PAGE("ca-app-pub-1135958776171939/5127069400"),
        // 동영상
        REWARD("ca-app-pub-1135958776171939/2788680675"),
        ;

        private final String label;

        ADID(String label) {
            this.label = label;
        }

        public String label() {
            return label;
        }
    }

    // 전면 광고 노출 조건
    public static final int AD_EXPOSE_COUNT_PAGE = 3;
    // 전면 광고 사용 여부
    public static final boolean USE_AD_EXPOSE_PAGE = true;
    // 동영상 광고 노출 조건
    public static final int AD_EXPOSE_COUNT_REWARD = 3;
    // 동영상 광고 사용 여부
    public static final boolean USE_AD_EXPOSE_REWARD = true;
}
