.class public final Landroidx/activity/result/IntentSenderRequest$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/IntentSenderRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/result/IntentSenderRequest$Builder$Flag;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bR\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/activity/result/IntentSenderRequest$Builder;",
        "",
        "pendingIntent",
        "Landroid/app/PendingIntent;",
        "(Landroid/app/PendingIntent;)V",
        "intentSender",
        "Landroid/content/IntentSender;",
        "(Landroid/content/IntentSender;)V",
        "fillInIntent",
        "Landroid/content/Intent;",
        "flagsMask",
        "",
        "flagsValues",
        "build",
        "Landroidx/activity/result/IntentSenderRequest;",
        "setFillInIntent",
        "setFlags",
        "values",
        "mask",
        "Flag",
        "activity_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private fillInIntent:Landroid/content/Intent;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private flagsMask:I

.field private flagsValues:I

.field private final intentSender:Landroid/content/IntentSender;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string v0, "pendingIntent.intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/activity/result/IntentSenderRequest$Builder;-><init>(Landroid/content/IntentSender;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1
    .param p1    # Landroid/content/IntentSender;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->intentSender:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final build()Landroidx/activity/result/IntentSenderRequest;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/activity/result/IntentSenderRequest;

    iget-object v1, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->intentSender:Landroid/content/IntentSender;

    iget-object v2, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->fillInIntent:Landroid/content/Intent;

    iget v3, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->flagsMask:I

    iget v4, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->flagsValues:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public final setFillInIntent(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$Builder;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    iput-object p1, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->fillInIntent:Landroid/content/Intent;

    return-object p0
.end method

.method public final setFlags(II)Landroidx/activity/result/IntentSenderRequest$Builder;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iput p1, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->flagsValues:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/activity/result/IntentSenderRequest$Builder;->flagsMask:I

    .line 4
    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method
