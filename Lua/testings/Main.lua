function newText(text)
    return {
        text = text or "nada", text2 = "kkkkk",

        getText = function(self) return self.text end,
getText2 = function(self) return self.text2 end }
end

local myText = newText("hola")

function love.draw()
    love.graphics.print("pinga", 400, 300)
    love.graphics.print(myText:getText(), 500, 300)
    love.graphics.print(myText:getText2(), 600, 400)
end