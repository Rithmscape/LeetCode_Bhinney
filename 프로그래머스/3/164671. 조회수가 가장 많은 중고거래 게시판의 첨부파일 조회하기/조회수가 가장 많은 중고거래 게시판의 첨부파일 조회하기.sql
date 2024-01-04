select concat("/home/grep/src/", f.board_id, "/", file_id, file_name, file_ext) as file_path
from used_goods_file as f
left join used_goods_board as b
on f.board_id = b.board_id
where views = (select max(views) from used_goods_board)
order by file_id desc