.class final Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBar_androidKt;->SearchBarInputField(Ljava/lang/String;Lv3/l;Lv3/l;ZLv3/l;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/text/KeyboardActionScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/text/KeyboardActionScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/text/KeyboardActionScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $onSearch:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $query:Ljava/lang/String;


# direct methods
.method constructor <init>(Lv3/l;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;->$onSearch:Lv3/l;

    iput-object p2, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;->$query:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;->invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text/KeyboardActionScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object p1, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;->$onSearch:Lv3/l;

    iget-object v0, p0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarInputField$4$1;->$query:Ljava/lang/String;

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
