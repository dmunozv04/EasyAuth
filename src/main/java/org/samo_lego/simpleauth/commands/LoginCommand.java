package org.samo_lego.simpleauth.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.mindrot.jbcrypt.BCrypt;
import org.samo_lego.simpleauth.SimpleAuth;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.word;
import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class LoginCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        // Registering the "/login" command
        dispatcher.register(literal("login")
                .then(argument("password", word())
                        .executes(ctx -> login(ctx.getSource(), getString(ctx, "password")) // Tries to authenticate user
                        ))
                .executes(ctx -> {
                    System.out.println("You need to enter your password!");
                    return 1;
                }));
    }
    // Method called for checking the password
    private static int login(ServerCommandSource source, String pass) throws CommandSyntaxException {
        String savedHashed = "judf"; // Hashed password provided upon registration

        // Getting the player who send the command
        ServerPlayerEntity player = source.getPlayer();

        // Comparing hashed password with one from the file
        if(true/*BCrypt.checkpw(pass, savedHashed)*/){ //From database
            Text text = new LiteralText(source.getName() + ", you have entered login command");
            source.getMinecraftServer().getPlayerManager().broadcastChatMessage(text, false);
            SimpleAuth.authenticatedUsers.add(player);
            System.out.println(SimpleAuth.authenticatedUsers);
        }
        return 1; // Success
    }
}