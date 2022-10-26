package com.adobe.marketing.mobile.launch.rulesengine.download;

import java.io.File;

class ExtractedRules {
    private static final String TAG = "ExtractedRules";
    final String rules;
    final File ruleAssets;

    ExtractedRules(final String rules, final File extractedAssets) {
        this.rules = rules;
        this.ruleAssets = extractedAssets;
    }
}
