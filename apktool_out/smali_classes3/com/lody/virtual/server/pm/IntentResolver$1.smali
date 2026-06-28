.class Lcom/lody/virtual/server/pm/IntentResolver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/IntentResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/content/IntentFilter;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/IntentFilter;->getPriority()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Landroid/content/IntentFilter;

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/content/IntentFilter;->getPriority()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    instance-of v0, p1, Landroid/content/pm/ResolveInfo;

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 24
    .line 25
    check-cast p2, Landroid/content/pm/ResolveInfo;

    .line 26
    .line 27
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    move p1, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroid/content/IntentFilter;->getPriority()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :goto_0
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 38
    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    move p2, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {p2}, Landroid/content/IntentFilter;->getPriority()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    :goto_1
    if-le p1, p2, :cond_3

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    if-ge p1, p2, :cond_4

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    :cond_4
    :goto_2
    return v1
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
