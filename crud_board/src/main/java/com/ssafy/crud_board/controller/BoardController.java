package com.ssafy.crud_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.crud_board.entity.Board;
import com.ssafy.crud_board.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/write")
	public String boardWriteForm() {
		return "boardwrite";
	}
	
	@PostMapping("/writepro")
	public String boardWritePro(Board board) {
		boardService.write(board);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/list")
	public String boardList(Model model) {
		model.addAttribute("list", boardService.boardList());
		
		return "boardlist";
	}
	
	@GetMapping("/view")
	public String boardView(Model model, Integer id) {
		model.addAttribute("board", boardService.boardView(id));
		
		return "boardview";
	}
}