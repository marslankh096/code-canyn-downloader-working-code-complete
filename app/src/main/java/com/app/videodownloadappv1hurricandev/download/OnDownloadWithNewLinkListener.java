/*
 * Copyright (c) 2021.  Hurricane Development Studios
 */

package com.app.videodownloadappv1hurricandev.download;

//interface created outside DownloadsInactive in a different file to avoid cyclic inheritance
public interface OnDownloadWithNewLinkListener {
    void onDownloadWithNewLink(DownloadVideo download);
}
