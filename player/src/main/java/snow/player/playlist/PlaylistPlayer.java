package snow.player.playlist;

import java.util.List;

import snow.player.Player;

public interface PlaylistPlayer extends Player {
    void skipToPrevious();

    void skipToPosition(int position);

    void setPlayMode(int playMode);

    void notifyPlaylistSwapped(int position, boolean playOnPrepared);

    void notifyMusicItemMoved(int fromPosition, int toPosition);

    void notifyMusicInserted(int position);

    void notifyMusicInserted(int position, int count);

    void notifyMusicRemoved(int position);

    void notifyMusicRemoved(List<Integer> positions);

    class PlayMode {
        public static final int SEQUENTIAL = 0;
        public static final int LOOP = 1;
        public static final int SHUFFLE = 2;
    }

    interface OnPlaylistChangeListener {
        void onPlaylistChanged(PlaylistManager playlistManager);
    }

    interface OnPlayModeChangeListener {
        void onPlayModeChanged(int playMode);
    }

    interface OnPlayingMusicItemPositionChangeListener {
        void onPlayingMusicItemPositionChanged(int position);
    }
}