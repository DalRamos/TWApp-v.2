package com.oop.twapp

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentTutorWaveBinding
import android.widget.Button
private lateinit var playButton: Button
private lateinit var pauseButton: Button

class TutorWaveFragment : Fragment() {

    private lateinit var binding: FragmentTutorWaveBinding
    private lateinit var twaBack: ImageView
    private lateinit var make: TextView
    private lateinit var team: TextView
    private lateinit var videoView: VideoView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTutorWaveBinding.inflate(inflater, container, false)

        twaBack = binding.root.findViewById(R.id.twaBack)
        make = binding.root.findViewById(R.id.make)
        team = binding.root.findViewById(R.id.team)

        twaBack.setOnClickListener {
            findNavController().popBackStack()
        }

        make.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_tutorWaveFragment_to_tabFragment)
        }


        playButton = binding.root.findViewById(R.id.playButton)
        pauseButton = binding.root.findViewById(R.id.pauseButton)


        val videoView = binding.root.findViewById<VideoView>(R.id.videoView)
        val videoUri = Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.tutorvid)
        videoView.setVideoURI(videoUri)

        videoView.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.isLooping = true
            videoView.start()

            playButton.setOnClickListener {
                if (!videoView.isPlaying) {
                    videoView.start()
                }
            }
            pauseButton.setOnClickListener {
                if (videoView.isPlaying) {
                    videoView.pause()
                }
            }
        }


        return binding.root
    }
}