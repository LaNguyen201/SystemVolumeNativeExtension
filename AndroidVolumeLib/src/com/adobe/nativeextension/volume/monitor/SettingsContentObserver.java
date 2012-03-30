/**
 * Copyright (C) 2011 Digital Primates
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **/

package com.adobe.nativeextension.volume.monitor;

import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

import com.adobe.nativeextension.volume.VolumeExtension;

public class SettingsContentObserver extends ContentObserver {
	public static final String TAG = "SettingsContentObserver";
	
	public SettingsContentObserver(Handler handler) {
	    super(handler);
	} 

	@Override
	public boolean deliverSelfNotifications() {
	     return super.deliverSelfNotifications(); 
	}

	@Override
	public void onChange(boolean selfChange) {
	    super.onChange(selfChange);
	    Log.v(TAG, "Settings change detected");
	    
		// Dispatch event to AIR.
		VolumeExtension.notifyVolumeChange();
	}
}