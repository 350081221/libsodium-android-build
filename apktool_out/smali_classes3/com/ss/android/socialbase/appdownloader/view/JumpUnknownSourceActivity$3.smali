.class Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->c(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p1, p2, v0, v1}, Lcom/ss/android/socialbase/appdownloader/b;->a(Landroid/content/Context;Landroid/content/Intent;ILorg/json/JSONObject;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-static {p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/b;->a(Landroid/content/Context;Landroid/content/Intent;Z)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget-object p2, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 43
    .line 44
    invoke-static {p2}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->c(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/appdownloader/b;->c(ILorg/json/JSONObject;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p2, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 58
    .line 59
    invoke-static {p2}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->c(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/appdownloader/b;->a(ILorg/json/JSONObject;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;->a:Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 69
    .line 70
    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
