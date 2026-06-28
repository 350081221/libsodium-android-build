.class public final Landroidx/compose/ui/modifier/ModifierLocalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "modifierLocalOf",
        "Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "T",
        "defaultFactory",
        "Lkotlin/Function0;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final modifierLocalOf(Lv3/a;)Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .locals 1
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)",
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    invoke-direct {v0, p0}, Landroidx/compose/ui/modifier/ProvidableModifierLocal;-><init>(Lv3/a;)V

    return-object v0
.end method
