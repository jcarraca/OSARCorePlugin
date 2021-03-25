package com.outsystems.ar.core;

import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;
import java.io.*;

public class OSARCorePlugin extends CordovaPlugin {

	private Context ctx = null;

	@Override
	protected void pluginInitialize() {
		ctx = cordova.getActivity().getApplicationContext();
  	}

	@Override
	public boolean execute(final String action, final CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
		System.out.println("Entrei aqui");
		Intent intent = new Intent(ctx, HelloArActivity.class);
		
		ctx.startActivity(intent);
		return true;
	}
}
