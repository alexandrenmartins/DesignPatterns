package comportamentais.command.commands;

import comportamentais.command.editor.Editor;

public class ClearCommand extends Command {

    public ClearCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.textField.setText("");
        return false;
    }
}
