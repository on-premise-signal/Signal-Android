package org.thoughtcrime.securesms.push;

import android.content.Context;

import org.thoughtcrime.securesms.R;
import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

public class CdnTrustStore implements TrustStore {

    private final Context context;

    public CdnTrustStore(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    public InputStream getKeyStoreInputStream() {
        return context.getResources().openRawResource(R.raw.cdn);
    }

    @Override
    public String getKeyStorePassword() {
        return "qephone";
    }
}
