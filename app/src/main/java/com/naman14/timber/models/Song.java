/*
 * Copyright (C) 2015 Naman Dwivedi
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.naman14.timber.models;

public class Song {

    public final long id;
    public final long listId;
    public final String songName;
    public final int duration;
    public final String path;

    public Song() {
        this.id = -1;
        this.listId = -1;
        this.songName = "";
        this.duration = -1;
        this.path = "";
    }

    public Song(long _songId, long _listId, String _songName, int _duration, String _path) {
        this.id = _songId;
        this.listId = _listId;
        this.songName = _songName;
        this.duration = _duration;
        this.path = _path;
    }
}
