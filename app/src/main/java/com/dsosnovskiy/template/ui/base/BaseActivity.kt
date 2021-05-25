package com.dsosnovskiy.template.ui.base

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

abstract class BaseActivity<T : BaseViewModel> : AppCompatActivity() {

    companion object {
        private const val TAG = "M_BaseActivity"
    }

    protected abstract val layout: Int

    protected abstract val viewModel: T

    private lateinit var permissionsWithCallbacks: Map<String, ((Boolean)->Unit)?>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layout)
    }

    protected fun requestPermissionsWithCallback(permissionsWithCallbacks: Map<String, (()->Unit)?>) {

        val requestingPermissions = permissionsWithCallbacks.keys.toTypedArray()

        ActivityCompat.requestPermissions(this, requestingPermissions, 1)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        for(i in grantResults.indices) {

            val wasPermissionGranted: Boolean = (grantResults[i] == PackageManager.PERMISSION_GRANTED)

            permissionsWithCallbacks[permissions[i]]?.invoke(wasPermissionGranted)
        }
    }
}