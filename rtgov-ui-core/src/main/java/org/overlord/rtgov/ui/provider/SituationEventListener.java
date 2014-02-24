/*
 * Copyright 2013-4 Red Hat Inc
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
package org.overlord.rtgov.ui.provider;

import org.overlord.rtgov.ui.client.model.SituationEventBean;

/**
 * This interface represents a listener interested in receiving
 * situation events.
 *
 */
public interface SituationEventListener {
	
	/**
	 * This method is invoked to handle a situation event.
	 * 
	 * @param event The situation event
	 */
	public void onSituationEvent(SituationEventBean event);

}
