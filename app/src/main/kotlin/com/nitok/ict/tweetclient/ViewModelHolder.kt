/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nitok.ict.tweetclient

import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Non-UI Fragment used to retain ViewModels.
 */
class ViewModelHolder<VM> : androidx.fragment.app.Fragment() {

    var viewmodel: VM? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    fun setViewModel(viewModel: VM) {
        viewmodel = viewModel
    }

    companion object {

        fun <M> createContainer(viewModel: M): ViewModelHolder<*> {
            val viewModelContainer = ViewModelHolder<M>()
            viewModelContainer.setViewModel(viewModel)
            return viewModelContainer
        }
    }
}
